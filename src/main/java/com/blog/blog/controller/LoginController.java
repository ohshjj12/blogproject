package com.blog.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String login(
        HttpServletRequest req,
        @RequestParam(value="error", required=false) String error
    ) {
        
        if(error != null) {
            req.setAttribute("errorMsg", "아이디 또는 패스워드를 확인해주세요.");
        }
        return "login";
    }
}