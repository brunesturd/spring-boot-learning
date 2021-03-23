package com.example.boot.basic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

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
public class Friend {
    private String hobby;
    private String gender;
}
