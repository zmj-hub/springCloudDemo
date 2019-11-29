package com.zmj.consumer.controller;

import com.zmj.consumer.domin.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation(value = "获取用户详情", produces = MediaType.APPLICATION_JSON_VALUE)
//    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public Object getUserById(HttpServletRequest request, @RequestParam(required = false) Long userId) {
        User user= restTemplate.getForObject("http://127.0.0.1:8090/user/getUserById", User.class);
        return user;
    }


}
