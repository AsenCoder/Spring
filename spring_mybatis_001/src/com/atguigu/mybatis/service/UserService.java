package com.atguigu.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.mybatis.entities.User;
import com.atguigu.mybatis.mapper.UserMapper;


@Service
@Transactional(readOnly=true)
public class UserService
{
	@Autowired
	private UserMapper mapper;
	
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	public void add(User user)
	{
		mapper.add(user);
	}
	
}
