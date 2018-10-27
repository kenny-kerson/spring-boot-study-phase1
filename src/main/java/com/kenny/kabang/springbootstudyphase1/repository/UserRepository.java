package com.kenny.kabang.springbootstudyphase1.repository;

import com.kenny.kabang.springbootstudyphase1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
