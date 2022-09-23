package com.example.demo.exception;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ErrorResponse {

    private String message;
    private int status;
    private String error;
}
