package com.kenny.kabang.springbootstudyphase1.controller;

import com.kenny.kabang.springbootstudyphase1.model.User;
import com.kenny.kabang.springbootstudyphase1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.JDBCType;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource datasource;

    @GetMapping("/user/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    /*
     * user.html
     */
    @GetMapping("/user/info")
    public String userInfo( Model model ) {

        User user = new User();
        user.setUserId("kenny.k");
        user.setUserName("Dongkyoon");
        user.setUserAge("34");

        model.addAttribute( user );

        return "user";
    }

    /*
     * REST
     */
    @GetMapping("/user/info/rest")
    @ResponseBody
    public User userInfoForRest() {

        User user = new User();
        user.setUserId("kenny.k");
        user.setUserName("Dongkyoon");
        user.setUserAge("34");

        return user;
    }

    /*
     * user.html
     */
    @GetMapping("/user/info/db")
    public String userInfoForDB( Model model ) {

        model.addAttribute( userRepository.getOne("bella") );

        return "user";
    }

    /*
     * REST
     */
    @GetMapping("/user/info/db/rest")
    @ResponseBody
    public Optional<User> userInfoForRestAndDB() {

        return userRepository.findById("bella");
    }

}
