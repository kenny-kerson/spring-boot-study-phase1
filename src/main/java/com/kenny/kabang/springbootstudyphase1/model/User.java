package com.kenny.kabang.springbootstudyphase1.model;

import javax.persistence.*;

@Entity
@Table(name="user", schema="test")
public class User {

    @Id
    @Column(name="id")
    private String userId;

    @Column(name="name")
    private String userName;

    @Column(name="age")
    private String userAge;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}
