package com.zmj.consumer.controller;

import com.zmj.consumer.config.MySpringbootFeign;
import com.zmj.consumer.domin.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    MySpringbootFeign mySpringbootFeign;

    @ApiOperation(value = "获取用户详情", produces = MediaType.APPLICATION_JSON_VALUE)
//    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/getUser/{userId}", method = RequestMethod.GET)
    public Object getUser(HttpServletRequest request, @PathVariable Long userId) {
//        User user= restTemplate.getForObject("http://eureka-client/user/getUserById?userId="+userId, User.class);
        User user = mySpringbootFeign.getUserById(userId);
        return user;
    }


}
