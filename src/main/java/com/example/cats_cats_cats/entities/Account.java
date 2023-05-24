package com.example.cats_cats_cats.entities;

import jakarta.persistence.*;
import lombok.NonNull;

@Entity(name="account")
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    String name;

    @NonNull
    String password;

    @NonNull
    String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
