package com.example.boot.basic.entity;

import com.example.boot.basic.conf.MixPropertySourceFactory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;

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
@Validated
@PropertySource(value = {"classpath:family.yml"},factory = MixPropertySourceFactory.class)
@ConfigurationProperties(prefix = "family")
public class Family {

    //@Value("${family.family-name}")
    @Length(min = 5, max = 20, message = "家庭名称长度必须位于5-20之间")
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;
}

