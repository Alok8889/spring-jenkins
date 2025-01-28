package com.tv.Jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("Test Cases Executeed...");
		logger.info("Test Cases Executeed 2nd statement...");
		assertEquals(true, true);
	}

}
