package com.example.boot.basic;

import com.example.boot.basic.entity.FileSize;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * @Author asus
 * @Description
 * @Date 2021/3/9
 **/
@Slf4j
//@RunWith(SpringRUNNER.CLASS)  junit4的写法
@SpringBootTest
@ExtendWith(SpringExtension.class)   //junit5的写法
class FileSizeTest {
    @Resource
    private FileSize fileSize;
    
    @Test
    void getMaxSize() {
        String maxSize = fileSize.getMaxSize();
        log.info("fileSize:" + fileSize.getMaxSize());
        assertEqualsd("300MB",maxSize);
    }

    private void assertEqualsd(String s, String maxSize) {
    }
}
