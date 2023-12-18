package com.example.restapi.Controller;

import com.example.restapi.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//응답내리는 방법
@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ResponseAptController {

    @GetMapping("") //http://localhost:8080/api/v1으로 맵핑
    public ResponseEntity<User> user(){
        var user = new User();
        user.setName("김김");
        user.setCallNum(987);
        user.setEmail("abc@gmail.com");
        
        log.info("user : {}", user);

        //필요시에 에러코드, 헤더, 응답을 조작할 수 있다.
        var res = ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .header("X-custom", "hi")
                .body(user);
        return res;
    }
}
