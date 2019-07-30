package com.validator;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class Demo {
    @NotNull(message = "id不能为空")
    private Integer id;
    @NotBlank(message = "name不能为空白字符串")
    private String name;
    @Range(min = 1, max = 3, message = "age在[1,3]之间")
    private Integer age;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
