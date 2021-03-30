package com.springboot.ssl.springbootssl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HttpsResource {

    @GetMapping("/hello")
    public String demo(){
        return "Hello Good Morning";
    }
}
