package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//这是一个接口类
@RestController
public class HelloController {
    //访问hello的时候会执行这个内容
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot";
    }

    //RequestParam查询参数
    @GetMapping("/helloName")
    //@RequestParam("username")  --这个表示http://localhost:8080/helloName?username=小明
    //这种是没有写的时候自动显示游客
    public String helloName(@RequestParam(defaultValue = "游客") String name, @RequestParam(defaultValue = "未知") String sex) {
        return "您好," + name + sex;

    }

    //PathVariable路径参数
    @GetMapping("/hellpUserID/{id}")
    public String hellpUserID(@PathVariable String id) {
        return "查询的用户编号是:" + id;
    }

    //调用Json的
    @GetMapping("user-info")
    public List<User> getUser() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "小明", "男"));
        users.add(new User(2, "limao", "男"));
        return users;
    }

}

