package com.example.cats_cats_cats.controllers;

import com.example.cats_cats_cats.entities.Cat;
import com.example.cats_cats_cats.services.CatService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
@Validated
public class CatsController {

    CatService catService;

    @GetMapping("/getCatList")
    public ResponseEntity<List> getCatList(){

        return new ResponseEntity<>(catService.getAllByCats(), HttpStatus.OK);
    }



    @PostMapping("/addCat")
    public ResponseEntity<String> addCat(@Valid @RequestBody Cat cat){
        catService.addCat(cat);
        return new ResponseEntity<>("Cat added to database, thanks for help", HttpStatus.OK);
    }

}
