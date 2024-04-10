package com.ferraz.dockerstudy.controller;

import com.ferraz.dockerstudy.domain.user.User;
import com.ferraz.dockerstudy.domain.user.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/test")
public class TestController {

    private UserRepository userRepository;

    public TestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String testGet() {
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> user.getName()).reduce("", (result, name) -> result + ", " + name);
    }

    @PostMapping
    public String testPost() {
        User user = new User();
        user.setName("Nome Usuario");
        userRepository.save(user);
        return "Usuario inserido";
    }

}
