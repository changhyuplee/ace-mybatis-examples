package com.github.vendigo.examples.acemybatis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String email;
    private String city;
    private String firstName;
    private String lastName;
    private String nickname;
    private String phoneNumber;
}
