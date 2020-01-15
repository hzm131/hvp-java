package com.hzm.controller;



import com.hzm.entity.User;
import com.hzm.entity.Result;

import com.hzm.service.UserService;
import com.hzm.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public  ResponseEntity<Result> login(@Valid @RequestBody User user, BindingResult bindingResult){
        System.out.println("loginUtils"+user.toString());
        if (bindingResult.hasErrors()) {
            return new ResponseEntity(ResultUtil.error(400,0, bindingResult.getFieldError().getDefaultMessage()),HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(ResultUtil.success(user),HttpStatus.OK);
    }

    @PostMapping(value = "/registered")
    public ResponseEntity<Result> registered(@Valid @RequestBody User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return new ResponseEntity(ResultUtil.error(400,0, bindingResult.getFieldError().getDefaultMessage()),HttpStatus.BAD_REQUEST);
        }
        userService.addUser(user);
        return new ResponseEntity(ResultUtil.success(user),HttpStatus.OK);
    }
}
