package com.spring.playground.model;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Member {
    private String memberId;
    private String name;
}
