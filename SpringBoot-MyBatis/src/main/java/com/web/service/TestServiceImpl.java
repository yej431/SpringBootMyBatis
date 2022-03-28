package com.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.mapper.UserMapper;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<Map<String, Object>> getTest() {
		return userMapper.getTest();
	}
}
