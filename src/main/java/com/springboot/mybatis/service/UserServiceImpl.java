package com.springboot.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mybatis.bean.User;
import com.springboot.mybatis.mapper.UserMapper;

@Service
public class UserServiceImpl {

	@Autowired
    private UserMapper userMapper;
	
	public List<User> getAllUsers(){
		return userMapper.getAll();
	}
	
	public void deleteById(int id){
		userMapper.delete(id);
	}
	
	
}
