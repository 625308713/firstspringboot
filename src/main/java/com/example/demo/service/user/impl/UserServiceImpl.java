package com.example.demo.service.user.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.service.user.UserService;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User getUserInfoById(String uId) {
        return userDao.getUserInfoById(uId);
    }


	@Override
	public int getUserByName(String name) {
		return userDao.getUserByName(name);
	}


	@Override
	public void register(Map<String,String> map) {
		userDao.register(map);
	}

//    @Override
//    public UserDomain login(String username, String password) {
//        if (StringUtils.isBlank(username) || StringUtils.isBlank(password))
//            throw BusinessException.withErrorCode(ErrorConstant.Auth.USERNAME_PASSWORD_IS_EMPTY);
//
//        String pwd = TaleUtils.MD5encode(username + password);
//        UserDomain user = userDao.getUserInfoByCond(username, pwd);
//        if (null == user)
//            throw BusinessException.withErrorCode(ErrorConstant.Auth.USERNAME_PASSWORD_ERROR);
//
//        return user;
//    }


}
