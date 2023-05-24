package com.example.cats_cats_cats.services;

import com.example.cats_cats_cats.entities.Account;
import com.example.cats_cats_cats.repositories.AccountRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AccountService {
    AccountRepository repository;
    ApplicationEventPublisher eventPublisher;
    public void register(Account account){
        eventPublisher.publishEvent(account);
        repository.save(account);
    }
}
