package com.example.demo.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class ErrorControllerAdvice {

    private String  MESSAGE  = "ERROR MESSAGE";
    private String mensagemError  = "já existe aluno cadastrado com esse e-mail ";

    @ResponseBody
    @ExceptionHandler(ExceptionEmail.class)
    public ErrorResponse ExceptionEmail(ExceptionEmail e) {
        return ErrorResponse.builder()
                .message(MESSAGE)
                .status(BAD_REQUEST.value())
                .error(mensagemError)
                .build();
    }
}
