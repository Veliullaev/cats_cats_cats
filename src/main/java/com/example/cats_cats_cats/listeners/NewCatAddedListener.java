package com.example.cats_cats_cats.listeners;

import com.example.cats_cats_cats.entities.Cat;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class NewCatAddedListener {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void handleNewListingAddedEvent(Cat cat){
        System.out.printf("DATABASE LOG: Added new cat named %s \n",cat.getName());
    }
}
