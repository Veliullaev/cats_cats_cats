package com.example.cats_cats_cats.entities;

import com.example.cats_cats_cats.constraits.DescriptionConstraint;
import com.example.cats_cats_cats.constraits.LinkConstraint;
import com.example.cats_cats_cats.constraits.NameConstraint;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@Table(name = "cats")
@Entity(name = "cat")
public class Cat {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    @NameConstraint
    String name; //short name for a gif

    @DescriptionConstraint
    String description; //what actually cat does in a gif

    @LinkConstraint
    String link; //link to a gif

    public Cat() {

    }
}
