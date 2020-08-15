package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.UsersMapper;
import com.pojo.Users;
import com.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Resource
	private UsersMapper usersMapper;
	@Override
	public List<Users> show() {
		return usersMapper.selAll();
	}

}
