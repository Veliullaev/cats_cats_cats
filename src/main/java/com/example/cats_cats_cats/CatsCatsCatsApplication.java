package com.example.cats_cats_cats;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PROTECTED)
public class CatsCatsCatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatsCatsCatsApplication.class, args);
	}

}
