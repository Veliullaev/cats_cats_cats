package com.example.cats_cats_cats.repositories;

import com.example.cats_cats_cats.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
