package com.example.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//롬복어노테이션 기능
@Data               //get, set메소드 자동생성
@AllArgsConstructor //파라미터를 받는 메소드를 만들어줌
@NoArgsConstructor //파라미터가 없는 메소드도 만들어줌
public class BookQueryParam {
    private String category;
    private String issuedYear;
    private String issuedPath;
    private String issuedDay;
}
