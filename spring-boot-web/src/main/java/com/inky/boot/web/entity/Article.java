package com.example.boot.basic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @Author asus
 * @Description 文章
 * @Date 2021/3/16
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private Integer id;
    private String author;
    private String title;
    private String  content;

    //@JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;
    //private List<BookReader> readers;

}
