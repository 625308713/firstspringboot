package com.example.demo.controller.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.user.UserService;

/**
 * 
 * @author daijinge
 * 2018.11.02
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    //注册
    @PostMapping(value = "user/register")
	@ResponseBody
    public String register(@RequestBody Map<String,String> map) {
    	String name = map.get("name");
    	String psd = map.get("psd");
    	if(name != null && !"".equals(name) && psd != null && !"".equals(psd)){
    		int count = userService.getUserByName(name);
    		if(count > 0) {
    			return "该用户名已被注册";
    		}else {
    			userService.register(map);
    			return "注册成功";
    		}
    	}else {
    		return "用户名或密码不能为空";
    	}
    }
    
    //map或者对象传参
    @PostMapping(value = "user/getUserById")
	@ResponseBody
    public User getUserById(@RequestBody Map<String,String> map) {
    	String id = map.get("id");
    	User user = userService.getUserInfoById(id);
        return user;
    }
    
    //单个传参
    @PostMapping(value = "user/getId")
   	@ResponseBody
    public User getId(@RequestParam(name = "id")  String id) {
       	User user = userService.getUserInfoById(id);
        return user;
    }
    
    @GetMapping(value = "user/id")
    public User getUser(@RequestParam(name = "id")  String id) {
       	User user = userService.getUserInfoById(id);
        return user;
    }
    
    @GetMapping(value = "user/test")
    public String test() {
        return "Hello World!";
    }
}
