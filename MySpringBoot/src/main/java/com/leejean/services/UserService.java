package com.leejean.services;

import java.util.List;

import com.leejean.models.UserVo;

/**
 * 
 * TODO 用户业务接口.<br>
 * @author Leejean <br>
 * @version 1.0.0 2017年4月9日 下午5:06:51<br>
 * @see 
 * @since JDK 1.7.0
 */
public interface UserService {

	UserVo findByName(String name);

	UserVo findByNameAndAge(String name, Integer age);

    UserVo findUser(String name);

    UserVo findUserById(Long id);

	List<UserVo> findAll();

	UserVo save(UserVo user);

	Long delete(Long id);

}
