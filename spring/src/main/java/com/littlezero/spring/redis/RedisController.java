package com.littlezero.spring.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RedisController {

    private final RedisService redisService;

    @PostMapping("/redis")
    public String testRedis(@RequestBody String testValue){
        return redisService.redisCheck(testValue);
    }

}
