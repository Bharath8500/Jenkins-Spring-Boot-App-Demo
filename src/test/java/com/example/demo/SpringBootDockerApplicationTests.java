package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDockerApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(SpringBootDockerApplicationTests.class);

	@Test
	void contextLoads() {
		log.debug("Hy this is running from test case centextLoads");
	}

}
