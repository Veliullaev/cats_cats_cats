package com.example.cats_cats_cats.controllers;

import com.example.cats_cats_cats.entities.Account;
import com.example.cats_cats_cats.services.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class AccountsController {

    AccountService accountService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Account credentials){
        accountService.register(credentials);
        return new ResponseEntity<>("User has been registered", HttpStatus.OK);
    }

}
