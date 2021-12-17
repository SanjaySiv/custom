package de.hybris.training.core.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RegistrationNumberValidator implements ConstraintValidator<RegistrationNumber,String> {
    @Override
    public void initialize(RegistrationNumber constraintAnnotation) {

    }
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return value.toLowerCase().startsWith("kl");
    }
}
