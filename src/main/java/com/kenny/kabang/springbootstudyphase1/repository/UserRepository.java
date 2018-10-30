package com.kenny.kabang.springbootstudyphase1.repository;

import com.kenny.kabang.springbootstudyphase1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {
}
