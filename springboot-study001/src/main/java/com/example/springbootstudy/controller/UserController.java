package com.example.springbootstudy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zuyong.xu
 * @date: 2022-6-14
 */
@Api(tags = "用户信息")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation("获取用户信息")
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String getUser() {
        return "user";
    }
}
