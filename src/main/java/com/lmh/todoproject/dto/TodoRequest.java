package com.lmh.todoproject.dto;

import lombok.Data;

@Data
public class TodoRequest {
    private String title;
    private String description;
    private String type;
}