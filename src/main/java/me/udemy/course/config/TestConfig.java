package me.udemy.course.config;

import me.udemy.course.entities.User;
import me.udemy.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
       
        User u1 = new User(null, "Ezequiel Sousa", "kiel02505@gmail.com", "981123600", "123456");
        User u2 = new User(null, "Ezequiel Santos", "kielddev@gmail.com", "999554767", "12345678");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
