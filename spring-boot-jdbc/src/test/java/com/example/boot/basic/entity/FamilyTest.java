package com.example.boot.basic.entity;

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

@SpringBootTest
@Slf4j
@ExtendWith(SpringExtension.class)
class FamilyTest {
    @Resource
    private Family family;

    @Test
    void testFamilyName() {
        log.info("family" + family);
    }

//    @Test
//    void getFamilyName(){
//        String familyName= family.getFamilyName();
//        log.info(familyName);
//        assertEquals("happy family",familyName);
//    }



}