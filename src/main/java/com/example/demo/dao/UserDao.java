package com.example.demo.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.User;


@Mapper
public interface UserDao {

    /**
     * @Description: 根据主键编号获取用户信息
     * @param uId 主键
     */
    User getUserInfoById(@Param("uid") String uId);
    
    int getUserByName(@Param("name") String name);
    
    void register(Map<String,String> map);
    /**
     * 根据用户名和密码获取用户信息
     * @param username
     * @param password
     * @return
     */
//    UserDomain getUserInfoByCond(@Param("username") String username, @Param("password") String password);

}
