package de.hybris.training.core.constraints;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = RegistrationNumberValidator.class)
@Documented
public @interface RegistrationNumber{
    String message() default "{de.hybris.training.core.constraints.RegistrationNumberValidator.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}