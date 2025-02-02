package com.pro.oauth2.controller;

import com.pro.oauth2.jwt.JwtService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class TestController {
    @GetMapping("/login-test")
    @ResponseBody
    public String loginInfo() {
        return "login";
    }

    @GetMapping("/logout-test")
    @ResponseBody
    public String logoutInfo() {
        return "logout"; // login page로 변경
    }

    @GetMapping("/hi")
    @ResponseBody
    public String hiInfo() {
        return "hi"; // accessToken 재발급 확인 테스트용
    }
}
