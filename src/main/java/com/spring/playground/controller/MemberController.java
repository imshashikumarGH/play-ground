package com.spring.playground.controller;


import com.spring.playground.model.Member;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/member")
public class MemberController {

    @GetMapping(value = "/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Member> getMemberDetails(@RequestParam("id") String memberId) {
        return new ResponseEntity<>(Member.builder().memberId(memberId).name("Shashi").build(), HttpStatus.OK);
    }
}
