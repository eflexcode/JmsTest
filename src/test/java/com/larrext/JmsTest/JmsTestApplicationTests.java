package com.larrext.JmsTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JmsTestApplicationTests {

	@Autowired
	MessageSender sender;

	@Test
	void testSendAndSave() {

		sender.sendMessage("Hiiiiiiiiii");

	}

}
