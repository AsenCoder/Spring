package com.atguigu.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.mybatis.entities.Dog;
import com.atguigu.mybatis.entities.DogExample;
import com.atguigu.mybatis.mapper.DogMapper;


@Service
@Transactional(readOnly=true)
public class DogService
{
	@Autowired
	private DogMapper mapper;
	
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	public int insert(Dog record)
	{
		return mapper.insert(record);
	}
	
	public List<Dog> selectByExample(DogExample example)
	{
		return mapper.selectByExample(example);
	}	

}
