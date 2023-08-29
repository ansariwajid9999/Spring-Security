package com.example.Spring.Security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Controller {
        @GetMapping("/welcome")
        public String welcome(){
            return "hi: welcome to the spring security class.";
        }
        @GetMapping("/admin")
        @PreAuthorize("hasAuthority('ROLE_ADMIN')")
        public String admin(){
            return "You are at admin page.";
        }
        @GetMapping("/user")
        @PreAuthorize("hasAuthority('ROLE_USER')")
        public String user(){
            return "You are at user page.";
        }
}
