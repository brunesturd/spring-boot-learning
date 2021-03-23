package com.example.boot.basic.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Min;


/**
 * @Author asus
 * @Description
 * @Date 2021/3/9
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Father {

   // @Value("${family.father.name}")

    @NotEmpty
    private String name;
    //@Value("${family.father.age}")
    @Min(21)
    private Integer age;
}
