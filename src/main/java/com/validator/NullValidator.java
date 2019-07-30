package com.validator;

import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;

public class NullValidator extends ValidatorHandler<Integer> implements Validator<Integer> {


    @Override
    public boolean validate(ValidatorContext context, Integer t) {
        if (t ==null) {
            context.addErrorMsg(String.format("xxxx not valid, invalid value=%s", t));
            return false;
        }
        return true;
    }
}
