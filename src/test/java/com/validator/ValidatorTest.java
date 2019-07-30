package com.validator;

import org.hibernate.validator.HibernateValidator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Iterator;
import java.util.Set;

public class ValidatorTest {

    public static void main(String[] args) {
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
                .configure()
                .failFast(true)
                .buildValidatorFactory();

        Validator validator = validatorFactory.getValidator();
        Demo demo=new Demo();
        demo.setId(1);
        demo.setName("test");
        demo.setAge(18);



        Set<ConstraintViolation<Demo>> validate = validator.validate(demo);
        if(!validate.isEmpty()){
            Iterator<ConstraintViolation<Demo>> iterator =
                    validate.iterator();
            if(iterator.hasNext()){
                ConstraintViolation<Demo> next = iterator.next();
                String message = next.getMessage();
                System.out.println("message=="+message);
            }

        }
    }
}
