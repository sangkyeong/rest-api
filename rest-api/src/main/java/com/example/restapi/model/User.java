package com.example.restapi.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)   //자동으로 snakecase로 바꿔준다
public class User {
    private String name;
    private Integer callNum;    //int가 아닌 Integer로
    private String email;
    private Boolean isKorean;   //boolean이 아닌 Boolean으로

    //파라미터 전송타입
    //    {
    //        "name" : "상",
    //            "call_num" : 12345678,
    //            "email" : "rlatkdrud123@naver.com",
    //            "is_korean" : true
    //    }
}
