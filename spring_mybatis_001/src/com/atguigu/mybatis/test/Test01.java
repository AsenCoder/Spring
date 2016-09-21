package com.atguigu.mybatis.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.mybatis.entities.Dog;
import com.atguigu.mybatis.entities.DogExample;
import com.atguigu.mybatis.entities.User;
import com.atguigu.mybatis.entities.DogExample.Criteria;
import com.atguigu.mybatis.service.DogService;
import com.atguigu.mybatis.service.UserService;

public class Test01
{

	private ApplicationContext ctx = null;
	private UserService userService = null;
	private DogService dogService = null;
	
	@Before
	public void init()
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = ctx.getBean(UserService.class);
		dogService = ctx.getBean(DogService.class);
	}
	
	
	@Test
	public void test()
	{
		User user = new User();
		user.setName("xx");
		user.setAge(27);
		userService.add(user);
	}
	@Test
	public void test2()
	{
		Dog record = new Dog();
		record.setDogName("ww7");
		record.setDogWeight(52);
		dogService.insert(record);
	}
	@Test
	public void test3()
	{
		DogExample example = new DogExample();
		
		Criteria criteria = example.createCriteria();
		
		criteria.andDogNameEqualTo("ww7");
		
		List<Dog> list = dogService.selectByExample(example);
		System.out.println(list.size());
	}	
}
