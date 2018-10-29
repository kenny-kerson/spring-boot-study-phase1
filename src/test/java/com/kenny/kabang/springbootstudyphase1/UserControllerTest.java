package com.kenny.kabang.springbootstudyphase1;

import com.kenny.kabang.springbootstudyphase1.controller.UserController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hello() {
//        mockMvc.perform(get().)
    }
}
