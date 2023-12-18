package com.example.restapi.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class DeleteController {

    @DeleteMapping(path = { //중괄호 사용으로 여러 주소를 사용할 수 있음
            "/user/{userName}/delete",
            "/user/{userName}/del"
    })
    public void delete(
            @PathVariable String userName
    ){
        log.info("user-name : {}", userName);
    }
    //CONSOLE>>
    //2023-12-05T11:21:30.780+09:00  INFO 11664 --- [nio-8080-exec-1] c.e.restapi.Controller.DeleteController  : user-name : abcd
    //2023-12-05T11:22:11.026+09:00  INFO 11664 --- [nio-8080-exec-2] c.e.restapi.Controller.DeleteController  : user-name : 홍길동
}
