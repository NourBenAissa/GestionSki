package com.tn.esprit.gestionfoyenour.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(IllegalArgumentException.class)
    public Map<String, String> handleNotFoundException(IllegalArgumentException exception) {
        Map<String, String> map=new HashMap<>();
        map.put("error",exception.getMessage());
        return map;
    }
}
