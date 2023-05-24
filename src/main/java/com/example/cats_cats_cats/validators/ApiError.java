package com.example.cats_cats_cats.validators;

import lombok.Value;
import org.springframework.http.HttpStatus;

import java.util.List;

@Value
public class ApiError {

    HttpStatus status;
    String message;
    List<String> errors;

}
