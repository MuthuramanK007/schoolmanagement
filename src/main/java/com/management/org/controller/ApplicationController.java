package com.management.org.controller;

import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ApplicationController {

    @GetMapping("/")
    public String index(){
        return "Welcome to School Management";
    }

//    @RequestMapping(path = "/error", method = RequestMethod.GET)
//    public String error(HttpServletRequest request){
//       String uri = request.getRequestURI();
//       return "Unknown URI -> "+ uri;
//    }
}
