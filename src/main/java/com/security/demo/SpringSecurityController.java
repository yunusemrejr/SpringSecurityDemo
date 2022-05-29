package com.security.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {

    String welcome="<i>Welcome to your landing page Yunus!</i>";



    @RequestMapping("/")

    public String landing(){

        return welcome;
    }

}
