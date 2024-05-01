package com.blit;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class FashionShowApplication {
    public static void main(String[] args) {
        SpringApplication.run(FashionShowApplication.class, args);
}

//		        UserRepository.save(new User(
//		                "user",
//		                // Username: admin, password: adminPass
//		                UserRepository.save(new User(
//		                         "admin",
//		                       "$2y$10$VKlPOmlBxacyOtoGuASJuu6F0E4Gf/VfiWsVZSHlr3xHzjn9DQ68W",
//		                             "ADMIN"));

}

