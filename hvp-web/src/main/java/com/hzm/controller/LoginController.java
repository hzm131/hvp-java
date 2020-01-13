package com.hzm.controller;



import com.hzm.param.LoginUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "user")
public class LoginController {
    @PostMapping(value = "/login")
    public String login(@RequestBody LoginUtils loginUtils, Map<String,Object> map){
        System.out.println(loginUtils.toString());
        if("hzm".equals(loginUtils.getUsername()) && "123456".equals(loginUtils.getPassword())){

            return "登录成功";
        }
        map.put("msg","用户名密码错误");
        return map.toString();
    }

    @PostMapping(value = "/registered")
    public String registered(@RequestBody LoginUtils loginUtils, Map<String,Object> map){
        System.out.println("注册");
        return map.toString();
    }
}
