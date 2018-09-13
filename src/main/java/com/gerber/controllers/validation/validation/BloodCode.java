package com.gerber.controllers.validation.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Constraint(validatedBy= BloodCodeConstraintValidator.class)
//@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BloodCode {
    public String value() default "RH";

    public String message() default "must start with RH";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
