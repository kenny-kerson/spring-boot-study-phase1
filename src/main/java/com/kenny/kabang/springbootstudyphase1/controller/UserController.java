package com.kenny.kabang.springbootstudyphase1.controller;

import com.kenny.kabang.springbootstudyphase1.model.User;
import com.kenny.kabang.springbootstudyphase1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

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

    @GetMapping("/user/info/rest/db")
    @ResponseBody
    public Optional<User> userInfoForRestAndDB() {

        return userRepository.findById("bella");
    }

    @GetMapping("/user/info/db")
    public String userInfoForDB( Model model ) {

        model.addAttribute( userRepository.getOne("bella") );

        return "user";
    }
}
