package com.example.spring.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class RedisService {

    private final RedisUtil redisUtil;

    public String redisCheck(String testValue){

        String key = createKey();

        // get, set 설정은 util에서 커스텀
        // 데이터 저장
        redisUtil.set(key, testValue, 1 );

        // 데이터 조회 및 강제 변환
        String result = (String) redisUtil.get(key);

        return result;
    }

    // 난수 키 생성
    public static String createKey() {
        StringBuffer key = new StringBuffer();
        Random rnd = new Random();

        for (int i = 0; i < 8; i++) { // 인증코드 8자리
            int index = rnd.nextInt(3); // 0~2 까지 랜덤

            switch (index) {
                case 0:
                    key.append((char) ((int) (rnd.nextInt(26)) + 97));
                    //  a~z  (ex. 1+97=98 => (char)98 = 'b')
                    break;
                case 1:
                    key.append((char) ((int) (rnd.nextInt(26)) + 65));
                    //  A~Z
                    break;
                case 2:
                    key.append((rnd.nextInt(10)));
                    // 0~9
                    break;
            }
        }

        return key.toString();
    }

}
