package com.didispace;

import com.didispace.domain.User;
import com.didispace.domain.UserRepository;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Before
	public void setUp() {
		//userRepository.deleteAll();
	}

	@Test
	public void test() throws Exception {

		try {
			// 创建三个User，并验证User总数
			userRepository.save(new User(1L, "嘿嘿嘿1", 30));
			userRepository.save(new User(2L, "嘿嘿嘿2", 40));
			userRepository.save(new User(3L, "嘿嘿嘿3", 50));
			List<User> findAll = userRepository.findAll();
			for (User user : findAll) {
				System.out.println(user.toString());
			}
//		// 删除一个User，再验证User总数
//		User u = userRepository.findOne(1L);
//		userRepository.delete(u);
//		Assert.assertEquals(2, userRepository.findAll().size());
//
//		// 删除一个User，再验证User总数
//		u = userRepository.findByUsername("mama");
//		userRepository.delete(u);
//		Assert.assertEquals(1, userRepository.findAll().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
