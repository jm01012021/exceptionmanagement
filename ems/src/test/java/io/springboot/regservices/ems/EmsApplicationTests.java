package io.springboot.regservices.ems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;



@EnableAutoConfiguration
@SpringBootTest
class EmsApplicationTests {

	@Test
	void contextLoads() {
        Assertions.assertTrue(true);
	}

}
