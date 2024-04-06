package com.spring.playground.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
class MemberControllerTest {

    @LocalServerPort
    private int serverPort;

    @Test
    void getMemberDetails() {
        log.info("serverPort : {}", serverPort);

    }
}