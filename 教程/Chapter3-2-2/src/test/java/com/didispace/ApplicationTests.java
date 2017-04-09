package com.didispace;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.didispace.domain.User;
import com.didispace.domain.UserRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() throws Exception {

		try {
			userRepository.save(new User("AAA", 10, 165.0));

//		// 测试findAll, 查询所有记录
//		Assert.assertEquals(10, userRepository.findAll().size());
//
//		// 测试findByName, 查询姓名为FFF的User
//		Assert.assertEquals(60, userRepository.findByName("FFF").getAge().longValue());
//
//		// 测试findUser, 查询姓名为FFF的User
//		Assert.assertEquals(60, userRepository.findUser("FFF").getAge().longValue());
//
//		// 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
//		Assert.assertEquals("FFF", userRepository.findByNameAndAge("FFF", 60).getName());
//
//		// 测试删除姓名为AAA的User
//		userRepository.delete(userRepository.findByName("AAA"));
//
//		// 测试findAll, 查询所有记录, 验证上面的删除是否成功
//		Assert.assertEquals(9, userRepository.findAll().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}


}
