package com.github.vendigo.examples.acemybatis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Slf4j
public class Launcher {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserMapper userMapper = appContext.getBean(UserMapper.class);
        checkSelect(userMapper);
        //checkInsert(userMapper);
    }

    private static void checkSelect(UserMapper userMapper) {
        log.info("Start select");
        userMapper.selectUsers().limit(10).forEach(u -> log.info("{}", u));
        log.info("End select");
    }

    private static void checkInsert(UserMapper userMapper) throws InterruptedException, ExecutionException {
        List<User> users = new ArrayList<>();
        for (int i=0; i<20000; i++) {
            users.add(new User("somemail"+i+"@gmail.com", "Kiev", "Petro", "Pomagai", "Illhelpyou", "0632113432"));
        }
        log.info("Start inserting");
        userMapper.insertUsers(users).get();
        log.info("End inserting");
    }
}
