package com.example.boot.basic.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author asus
 * @Description 文件大小的配置读取类
 * @Date 2021/3/9
 **/
@Data
@Component
public class FileSize {

    @Value("${spring.servlet.multipart.max-file-size}")

    private String maxSize;

    public String getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(String maxSize) {

    }
}
