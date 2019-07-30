package com.validator;


import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.Result;
import com.baidu.unbiz.fluentvalidator.jsr303.HibernateSupportedValidator;

import static com.baidu.unbiz.fluentvalidator.ResultCollectors.toSimple;

public class FluentValidatorTest {

    public static void main(String[] args) {

        Demo demo=new Demo();
        demo.setId(1);
        demo.setName("test");
        demo.setAge(18);

        Result ret = FluentValidator.checkAll()
                .on(demo.getId(),new NullValidator())
                .doValidate()
                .result(toSimple());
        System.out.println(ret);



//        Result ret1 = FluentValidator.checkAll()
//                .on(demo, new HibernateSupportedValidator<Demo>().setValidator(validator))
//                .doValidate().result(toSimple());
//        System.out.println(ret);
    }
}
