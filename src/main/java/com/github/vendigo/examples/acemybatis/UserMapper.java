package com.github.vendigo.examples.acemybatis;

import com.github.vendigo.acemybatis.config.AceMapper;

import java.util.stream.Stream;

@AceMapper
public interface UserMapper {
    Stream<User> selectUsers();
}
