package com.maxiflexy.kafkasetup.payload;

import lombok.Data;

@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
}
