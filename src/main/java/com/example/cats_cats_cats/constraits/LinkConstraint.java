package com.example.cats_cats_cats.constraits;

import jakarta.servlet.annotation.HttpConstraint;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { })
@NotBlank(message = "Link must not be empty!")
public @interface LinkConstraint {
    String message() default "This link is invalid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
