package com.leejean;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.leejean.services.JpaUserService;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class JpaTests {

	@Autowired
	private JpaUserService jpaUserService;

	@Before
	public void setUp() {
		//userRepository.deleteAll();
	}

	@Test
	public void testTransaction() throws Exception {
		try {
			jpaUserService.testTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

