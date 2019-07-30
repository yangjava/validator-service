package com.validator;

import org.hibernate.validator.HibernateValidator;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidatorUtils {

    public Validator validator() {
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
                .configure()
                .failFast(true)
                .buildValidatorFactory();
//        ValidatorFactory validatorFactory = Validation.byProvider( HibernateValidator.class )
//                .configure()
//                .addProperty( "hibernate.validator.fail_fast", "true" )
//                .buildValidatorFactory();
//        Validator validator = validatorFactory.getValidator();
        return validatorFactory.getValidator();
    }




}
