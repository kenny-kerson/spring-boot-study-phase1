package com.kenny.kabang.springbootstudyphase1.controller;

import com.kenny.kabang.springbootstudyphase1.model.Users;
import com.kenny.kabang.springbootstudyphase1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
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

        Users users = new Users();
        users.setUserId("kenny.k");
        users.setUserName("Dongkyoon");
        users.setUserAge("34");

        model.addAttribute(users);

        return "user";
    }

    /*
     * REST
     */
    @GetMapping("/user/info/rest")
    @ResponseBody
    public Users userInfoForRest() {

        Users users = new Users();
        users.setUserId("kenny.k");
        users.setUserName("Dongkyoon");
        users.setUserAge("34");

        return users;
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
    public Optional<Users> userInfoForRestAndDB() {

        return userRepository.findById("bella");
    }

}
