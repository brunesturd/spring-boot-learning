package com.example.boot.basic.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/5
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Param {
    private Integer id;
    private String title;

}
