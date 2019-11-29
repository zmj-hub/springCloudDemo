package com.zmj.consumer.config;

import com.zmj.consumer.domin.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient( name = "eureka-client")
public interface MySpringbootFeign {


    @RequestMapping(value = "user/getUserById/{userId}", method = RequestMethod.GET)
    User getUserById(@PathVariable("userId") Long userId);
}
