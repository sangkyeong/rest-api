package com.example.restapi.Controller;

import com.example.restapi.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class PutController {

    @PutMapping("/put") //post와 다른점 : 데이터가 이미 있다면 update한다
    public void put(
            @RequestBody User user
            ){
        log.info("REQUEST : {}", user);
        //system.out.println과 차이 콘솔에 표시 한다는건 같지만 양이 많을경우 서버부하가 많아짐, 또 상세하게 볼수 있다
    }
}
