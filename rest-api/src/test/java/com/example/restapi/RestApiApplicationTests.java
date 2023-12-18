package com.example.restapi;

import com.example.restapi.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired
	private ObjectMapper ojm;


	@Test
	void contextLoads() throws JsonProcessingException {
		var user = new User("김이이", 234, "123@naver.com", true);
//		user.setName("김이이");
//		user.setCallNum(234);
//		user.setEmail("123@naver.com");
//		user.setIsKorean(true);

		var json = ojm.writeValueAsString(user);
		System.out.println(json);
		//직렬화(JSON>DTO) - {"name":"김이이","call_num":234,"email":"123@naver.com","is_korean":true}

		var dto = ojm.readValue(json, User.class);
		System.out.println(dto);
		//역직렬화(DTO>JSON) - User(name=김이이, callNum=234, email=123@naver.com, isKorean=true)
	}

}
