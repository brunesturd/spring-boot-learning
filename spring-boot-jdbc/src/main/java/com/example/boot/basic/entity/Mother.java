package com.example.boot.basic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/9
 **/

@Data
@Component
//@ConfigurationProperties(prefix = "family.mother")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mother {
    private String name;
    private List<String> alias;

}
