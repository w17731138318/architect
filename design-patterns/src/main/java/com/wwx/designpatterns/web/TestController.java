package com.wwx.designpatterns.web;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private Integer count = 0;
    @PostMapping("thread")
    public Integer getCount(){
        count++;
        System.out.println(count);
        return count;
    }
}
