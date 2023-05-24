package com.example.cats_cats_cats.entities;

import com.example.cats_cats_cats.constraits.AccountNameConstraint;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity(name="account")
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @AccountNameConstraint
    String name;

    @NonNull
    String password;

    @NonNull
    String role;

    public Account() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
