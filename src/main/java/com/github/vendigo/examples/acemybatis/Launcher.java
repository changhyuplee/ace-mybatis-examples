package com.github.vendigo.examples.acemybatis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserMapper userMapper = appContext.getBean(UserMapper.class);
        userMapper.selectUsers().forEach(System.out::println);
    }
}
