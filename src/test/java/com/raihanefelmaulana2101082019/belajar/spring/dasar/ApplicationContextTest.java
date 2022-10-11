package com.raihanefelmaulana2101082019.belajar.spring.dasar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 *
 * @author hp
 */
public class ApplicationContextTest {
    
    @Test
    void testApplicationContext(){
    ApplicationContext context=new AnnotationConfigApplicationContext(HelloWordConfiguration.class);
    Assertions.assertNotNull(context);
    }
}
