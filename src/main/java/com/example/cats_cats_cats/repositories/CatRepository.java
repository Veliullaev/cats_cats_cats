package com.example.cats_cats_cats.repositories;

import com.example.cats_cats_cats.entities.Cat;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long>{

}

