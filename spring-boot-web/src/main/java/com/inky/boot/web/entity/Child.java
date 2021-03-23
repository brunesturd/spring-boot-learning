package com.example.boot.basic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

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
//@ConfigurationProperties(prefix = "family.child")
public class Child {
    private String name;
    private Integer age;
    private List<Map<String, Object>> friends;

}
