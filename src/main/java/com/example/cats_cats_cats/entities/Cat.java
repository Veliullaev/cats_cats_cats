package com.example.cats_cats_cats.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
//@NoArgsConstructor(force = true)
@AllArgsConstructor
@Table(name = "cats")
@Entity(name = "cat")
public class Cat {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    @NonNull
    String name; //short name for a gif
    String description; //what actually cat does in a gif

    @NonNull
    String link; //link to a gif

    public Cat() {

    }
}
