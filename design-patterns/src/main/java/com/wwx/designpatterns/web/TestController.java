package com.wwx.designpatterns.web;


import com.wwx.designpatterns.aop.LogAspect;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private Integer count = 0;
    @PostMapping("thread")
    @LogAspect
    public Integer getCount(){
        count++;
        System.out.println(count);
        return count;
    }
    @PostMapping("thread1")
    public Integer getCount1(){
        count++;
        System.out.println(count);
        return count;
    }
}
