package com.userservice.common.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class TodoObject {
    private Object data;
    private Object dataActivity;
    private Object dataImage;
    private String idTodoList;
    private String idTodo;
    private Short numberTodoComplete;
    private Short numberTodo;
}
