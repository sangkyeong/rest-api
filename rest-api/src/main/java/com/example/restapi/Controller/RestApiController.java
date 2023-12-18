package com.example.restapi.Controller;

import com.example.restapi.model.BookQueryParam;
import com.example.restapi.model.HomeWorkTest;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("/api")
public class RestApiController {
    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html><body> <h1> HELLO Spring Boot</h1> </body> </html>";

        return html;
    }

    @GetMapping(path = "/echo/{message}")
    public String echo(@PathVariable(name = "message") String msg){

        System.out.println("msg " +msg);
        return msg;
    }

    //수동으로 받는법
    @GetMapping(path = "/book")
    public void queryParam(@RequestParam String category, @RequestParam String issuedYear,
                           @RequestParam(name="issued-month") String issuedPath,
                            @RequestParam(name = "issued_day") String issuedDay){
        System.out.println("category "+category);
        System.out.println("issuedYear "+issuedYear);
        System.out.println("issuedPath "+issuedPath);
        System.out.println("issued_day "+issuedDay);

        //http://localhost:8080/api/book?category=IT&issuedYear=2023&issued-month=12&issued_day=05
        //CONSOLE ::
        //        category IT
        //        issuedYear 2023
        //        issuedPath 12
        //        issued_day 05
    }

    //객체로 받는법
    @GetMapping(path = "/book2")
    public void queryParam2(BookQueryParam bookQueryParam){
        System.out.println("bookQueryParam "+bookQueryParam);

        //기존 주소 그대로 사용 시>>>
        //http://localhost:8080/api/book2?category=IT&issuedYear=2023&issued-month=12&issued_day=05
        //CONSOLE :: bookQueryParam BookQueryParam(category=IT, issuedYear=2023, issuedPath=null, issuedDay=null)
        //수동으로 받을때와 달리 변수명을 camelCase 규칙을 따라서 쓰는게 합리적이다
        //주소바꾼 후 결과 >>>>>
        //http://localhost:8080/api/book2?category=IT&issuedYear=2023&issuedMonth=12&issuedDay=05
        //CONSOLE :: bookQueryParam BookQueryParam(category=IT, issuedYear=2023, issuedPath=null, issuedDay=05)
    }


    //객체로 받는법(실습)
    @GetMapping(path = "/book2Test")
    public String queryParamTest(HomeWorkTest homeWorkTest){
        System.out.println("homeWorkTest "+homeWorkTest);
        return homeWorkTest.getNum1()+homeWorkTest.getNum2()+" "+homeWorkTest.isBoo();

        //http://localhost:8080/api/book2Test?num1=10&num2=20&boo=false
        //CONSOLE :: homeWorkTest HomeWorkTest(num1=10, num2=20, boo=false)
    }
}
