package com.example.restapi.Controller;

import com.example.restapi.model.BookRequest;
import com.example.restapi.model.HomeWorkTest;
import com.example.restapi.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping(path = "/post")
    public String post(
            @RequestBody BookRequest bookRequest
            //post나 put을 사용할때
            // http body로 들어오는 데이터들을 해당 객체에 맵핑을 해줌
            // JSON(기본값)이나 HTML로 매칭
    ){
        System.out.println(bookRequest);
        //크롬 talend API사용
        //http://localhost:8080/api/post
        //JSON형태로 파라미터 전달
        //        {
        //            "name" : "sang",
        //                "number" : "26",
        //                "category" : "IT"
        //        }
        //CONSOLE>> BookRequest(name=sang, number=26, category=IT)
        //return bookRequest.toString(); >> BODY도 string형태로
        //return bookRequest; >> BODY에 JSON형태로 들어옴
        return bookRequest.toString();
    }

    //실습 : requestBody로 이름, 전화번호, 이메일을 받는 메소드 만들기
    @PostMapping(path = "/postTest")
    public String post2(
            @RequestBody User user
    ){
        System.out.println(user);
        return user.toString();
    }
}
