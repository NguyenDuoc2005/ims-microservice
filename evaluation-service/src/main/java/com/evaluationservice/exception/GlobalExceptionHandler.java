package com.evaluationservice.exception;

import com.evaluationservice.common.base.ResponseObject;
import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.BadRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 1. Lỗi không tìm thấy tài nguyên
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ResponseObject<?>> handleResourceNotFound(ResourceNotFoundException ex) {
        return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage(), null);
    }

    // 2. Lỗi dữ liệu nhập sai định dạng (DTO validate @NotBlank, @Size...)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseObject<?>> handleValidationException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        for (FieldError err : ex.getBindingResult().getFieldErrors()) {
            errors.put(err.getField(), err.getDefaultMessage());
        }
        return buildResponse(HttpStatus.BAD_REQUEST, "Validation failed", errors);
    }

    // 3. Lỗi vi phạm ràng buộc (validation trong service layer)
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ResponseObject<?>> handleConstraintViolation(ConstraintViolationException ex) {
        return buildResponse(HttpStatus.BAD_REQUEST, "Constraint violation", ex.getMessage());
    }

    // 4. Lỗi nghiệp vụ tự custom
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ResponseObject<?>> handleBadRequest(BadRequestException ex) {
        return buildResponse(HttpStatus.BAD_REQUEST, ex.getMessage(), null);
    }

    // 5. Lỗi không xác định (fallback)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseObject<?>> handleGeneralException(Exception ex, WebRequest request) {
        log.error("Unhandled error: ", ex);
        return buildResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error", null);
    }

    // Hàm trả response chuẩn
    private ResponseEntity<ResponseObject<?>> buildResponse(HttpStatus status, String message, Object data) {
        ResponseObject<Object> response = new ResponseObject<>(data, message);
        return new ResponseEntity<>(response, status);
    }

}

