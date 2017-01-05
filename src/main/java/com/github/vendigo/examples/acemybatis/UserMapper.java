package com.github.vendigo.examples.acemybatis;

import com.github.vendigo.acemybatis.config.AceMapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

@AceMapper
public interface UserMapper {
    Stream<User> selectUsers();
    CompletableFuture<Void> insertUsers(List<User> users);
}
