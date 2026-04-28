package com.example.MailSender;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/chat")
@CrossOrigin(origins = "*")
public class UserController {

    @GetMapping("/")
    public String home(){
        return "Welcome to adarsh fisrt page";
    }
}


