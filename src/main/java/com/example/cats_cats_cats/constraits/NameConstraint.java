package com.example.cats_cats_cats.constraits;

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
@NotBlank(message = "Name must not be empty!")
@Length(min = 4, max = 50, message = "Name must be at least 4 characters and less than 50 characters long !")
@NonNull
public @interface NameConstraint {
    String message() default "This name is invalid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
