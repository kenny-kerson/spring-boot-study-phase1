package com.kenny.kabang.springbootstudyphase1.controller;

import com.kenny.kabang.springbootstudyphase1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @GetMapping("/user/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @GetMapping("/user/info/rest")
    @ResponseBody
    public User userInfoForRest() {

        User user = new User();
        user.setUserId("kenny.k");
        user.setUserName("Dongkyoon");
        user.setUserAge("34");

        return user;
    }

    @GetMapping("/user/info")
    public String userInfo( Model model ) {

        User user = new User();
        user.setUserId("kenny.k");
        user.setUserName("Dongkyoon");
        user.setUserAge("34");

        model.addAttribute( user );

        return "user";
    }
}
