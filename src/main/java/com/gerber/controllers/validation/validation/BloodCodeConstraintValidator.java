package com.gerber.controllers.validation.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BloodCodeConstraintValidator implements ConstraintValidator<BloodCode,String>
{
    private String coursePrefix;

    public void initialize(BloodCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value();
    }

    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {

        boolean result;

        if(theCode!=null&&theCode.length()>=3)
        {
            result = theCode.startsWith(coursePrefix);
        }
        else
        {
            result=false;
        }

        return result;
    }
}
