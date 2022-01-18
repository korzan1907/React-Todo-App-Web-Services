package com.in28minutes.rest.basic.auth;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class BasicAuthenticationController {

    @GetMapping(path="/basicauth")
    public AuthenticationBean helloWorldBean(){
        return new AuthenticationBean(String.format("You are authenticated"));
        //throw new RuntimeException("Something is wrong");
    }
}
