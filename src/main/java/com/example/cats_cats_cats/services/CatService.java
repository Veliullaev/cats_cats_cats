package com.example.cats_cats_cats.services;

import com.example.cats_cats_cats.entities.Cat;
import com.example.cats_cats_cats.repositories.CatRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CatService {

    CatRepository repository;

    public List<Cat> getAllByCats(){

        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public void addCat(Cat cat) {
        repository.save(cat);
    }

}
