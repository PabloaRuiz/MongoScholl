package com.example.demo.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class ErrorControllerAdvice {

    final String MESSAGE  = "ERROR";


    @ResponseBody
    @ExceptionHandler(ExceptionEmail.class)
    public ExceptionResponse exceptionEmail(ExceptionEmail e) {
        return ExceptionResponse.builder()
                .mensagem(MESSAGE)
                .status(BAD_REQUEST.value())
                .error("there is already a student with this email")
                .build();
    }

    @ResponseBody
    @ExceptionHandler(ExceptionStudent.class)
    public ExceptionResponse exceptionEmail(ExceptionStudent e) {
        return ExceptionResponse.builder()
                .mensagem(MESSAGE)
                .status(BAD_REQUEST.value())
                .error("Student not exists!")
                .build();
    }
}
