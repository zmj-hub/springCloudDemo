package com.zmj.eurekaclient2.service;

import com.zmj.eurekaclient2.dao.UserDao;
import com.zmj.eurekaclient2.domin.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserService {

    @Resource
    UserDao userDao;

    public User getUserById(Long userId) {
        return userDao.getUserById(userId);
    }

}
