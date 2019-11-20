package com.zmj.eurekaclient.controller;

import com.zmj.eurekaclient.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "获取用户详情", produces = MediaType.APPLICATION_JSON_VALUE)
//    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public Object getUserById(HttpServletRequest request, @RequestParam Long userId) {
        return userService.getUserById(userId);
    }


}
