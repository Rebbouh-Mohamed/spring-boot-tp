package com.example.tp_orm;

import com.example.tp_orm.model.User;
import com.example.tp_orm.model.Role;

import com.example.tp_orm.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0) {
            String encodedPassword = passwordEncoder.encode("adminpass");
            userRepository.save(new User("admin", encodedPassword, "Admin", "admin@email.com", Role.ROLE_ADMIN));
            
            encodedPassword = passwordEncoder.encode("userpass");
            userRepository.save(new User("user", encodedPassword, "User", "user@email.com", Role.ROLE_USER));
        }
    }


}