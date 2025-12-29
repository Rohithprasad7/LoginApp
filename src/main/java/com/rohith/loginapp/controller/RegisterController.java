package com.rohith.loginapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.rohith.loginapp.model.User;
import com.rohith.loginapp.repository.UserRepository;

@Controller
public class RegisterController {

    private final UserRepository userRepo;

    public RegisterController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestParam String email,
            @RequestParam String password) {

        // Prevent duplicate email
        if (userRepo.findByEmail(email) != null) {
            return "redirect:/register?error";
        }

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        userRepo.save(user);

        // ✅ Always go back to login page
        return "redirect:/";
    }
}
