package net.codejava;

import net.codejava.controller.WebController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringBootApplicationTests {

    @Autowired
    private WebController controller;
    
	@Test
	void contextLoads() {
            Assertions.assertNotNull(controller);
	}

}
