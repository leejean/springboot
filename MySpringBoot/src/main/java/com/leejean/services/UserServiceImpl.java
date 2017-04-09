package com.leejean.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.leejean.entitys.User;
import com.leejean.models.UserVo;
import com.leejean.respository.UserRepository;

/**
 * 
 * TODO 用户业务实现类.<br>
 * @author Leejean <br>
 * @version 1.0.0 2017年4月9日 下午5:26:24<br>
 * @see 
 * @since JDK 1.7.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

	@Override
	public UserVo findByName(String name) {
		UserVo userVo = new UserVo();
		BeanUtils.copyProperties(this.userRepository.findByName(name), userVo);
		return userVo;
	}

	@Override
	public UserVo findByNameAndAge(String name, Integer age) {
		UserVo userVo = new UserVo();
		BeanUtils.copyProperties(this.userRepository.findByNameAndAge(name, age), userVo);
		return userVo;
	}

	@Override
	public UserVo findUser(String name) {
		UserVo userVo = new UserVo();
		BeanUtils.copyProperties(this.userRepository.findUser(name), userVo);
		return userVo;
		
	}

	@Override
	public UserVo findUserById(Long id) {
		UserVo userVo = new UserVo();
		BeanUtils.copyProperties(this.userRepository.findUserById(id), userVo);
		return userVo;
	}

	@Override
	public List<UserVo> findAll() {
		List<User> findAll = this.userRepository.findAll();
		UserVo userVo = null;
		List<UserVo> userVos = Lists.newArrayList();
		for (User user : findAll) {
			userVo = new UserVo();
			BeanUtils.copyProperties(user, userVo);
			userVos.add(userVo);
		}
		return userVos;
	}

	@Override
	public UserVo save(UserVo userVo) {
		User user = new User();
		
		BeanUtils.copyProperties(userVo, user);
		
		user = this.userRepository.save(user);
		
				
		return this.findUserById(user.getId());
	}

	@Override
	public Long delete(Long id) {
		this.userRepository.delete(id);
		return id;
	}
    
}
