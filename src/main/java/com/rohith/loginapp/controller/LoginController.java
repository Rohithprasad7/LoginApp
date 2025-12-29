package com.rohith.loginapp.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.rohith.loginapp.repository.UserRepository;

@Controller
public class LoginController {

    private final UserRepository userRepo;

    public LoginController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
            @RequestParam String password,
            HttpSession session) {

        if (userRepo.findByEmailAndPassword(email, password) != null) {
            // ✅ create session
            session.setAttribute("user", email);
            return "redirect:/dashboard";
        }

        return "redirect:/?error=true";
    }

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session) {

        // ✅ protect dashboard
        if (session.getAttribute("user") == null) {
            return "redirect:/";
        }

        return "dashboard";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // ✅ destroy session
        session.invalidate();
        return "redirect:/";
    }
}
