package com.evaluationservice.common.base;

import com.evaluationservice.config.constant.PaginationConstant;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PageableRequest {

    private int page = PaginationConstant.DEFAULT_PAGE;

    private int size = PaginationConstant.DEFAULT_SIZE;

    private String orderBy = PaginationConstant.DEFAULT_ORDER_BY;

    private String sortBy = PaginationConstant.DEFAULT_SORT_BY;

    private String q = PaginationConstant.DEFAULT_Q;

}
