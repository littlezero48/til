package com.littlezero.spring.openvidu;

import io.openvidu.java.client.*;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class Connect {

    // OpenVidu sessionId , token 생성
    public HashMap<String, String> connectOpenvidu() throws OpenViduJavaClientException, io.openvidu.java.client.OpenViduHttpException {

        // 1. OpenVIdu(WebRTC)는 EC2 서버를 추가하여 따로 생성하였음.
        // 2. git bash로 리눅스 언어, docker를 사용하여 OpenVidu를 설정 및 구축함

        // 현재 구축해놓은 OpenVidu 서버 주소
        String OPENVIDU_URL = "https://openvidu.haetae.shop";
        // 서버 주소를 사용하기 위한 SECRET키
        String OPENVIDU_SECRET = "MY_SECRET";

        // OpenVidu 객체에 주소와 SECRET키를 넣어 사용 준비
        OpenVidu openvidu = new OpenVidu(OPENVIDU_URL, OPENVIDU_SECRET);

        // 화상채팅을 사용하려면 session을 사용하게 되는데, session 설정값을 가져옴.
        SessionProperties properties = new SessionProperties.Builder().build();


        // OpenVidu에 세션 설정값을 input 하여 session 생성
        Session session = openvidu.createSession(properties);

        // 세션에 연결하기위한 설정 값 빌드
        ConnectionProperties connectionProperties = new ConnectionProperties.Builder()
                .type(ConnectionType.WEBRTC)
                .role(OpenViduRole.PUBLISHER)
                .data("user_data")
                .build();
        // 빌드된 세션 설정 값으로 세션의 연결점(커넥션) 생성
        Connection connection = session.createConnection(connectionProperties);

        // 커넥션을 사용해 token 생성 (session 과 마찬가지로 OpenVidu 컨텐츠를 사용하기 위해 token도 필요함)
        String token = connection.getToken();

        log.info("세션 아이디 : {} / 토큰 : {}", session.getSessionId(), token);

        // sessionId와 token을 저장하기 위한 HashMap 생성
        HashMap<String, String> sessionAndToken = new HashMap<>();

        // sessionId와 token을 HashMap에 저장
        sessionAndToken.put("sessionId", session.getSessionId());
        sessionAndToken.put("token", token);

        return sessionAndToken;
    }
}
