package com.hzm.controller;



import com.hzm.entity.User;
import com.hzm.utils.LoginUtils;
import com.hzm.utils.Result;

import com.hzm.utils.ResultUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "user")
public class LoginController {
    @PostMapping(value = "/login")
    public  ResponseEntity<Result> login(@Valid @RequestBody LoginUtils loginUtils, BindingResult bindingResult){
        System.out.println("loginUtils"+loginUtils.toString());
        if (bindingResult.hasErrors()) {
            return new ResponseEntity(ResultUtil.error(400,0, bindingResult.getFieldError().getDefaultMessage()),HttpStatus.BAD_REQUEST);
        }
        User user = new User();
        user.setId(1);
        user.setUserName("哈哈哈");
        user.setPassWord("333333");

        return new ResponseEntity(ResultUtil.success(user),HttpStatus.OK);
    }

    @PostMapping(value = "/registered")
    public String registered(@RequestBody LoginUtils loginUtils, Map<String,Object> map){
        System.out.println("注册");
        return map.toString();
    }
}
