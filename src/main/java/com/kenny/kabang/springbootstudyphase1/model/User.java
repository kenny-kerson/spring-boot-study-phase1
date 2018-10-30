package com.kenny.kabang.springbootstudyphase1.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(userAge, user.userAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userAge);
    }
}
