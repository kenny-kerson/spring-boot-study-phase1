package com.kenny.kabang.springbootstudyphase1.repository;

import com.kenny.kabang.springbootstudyphase1.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersRepositoryTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserRepository userRepository;

    @Test
    public void start() throws SQLException {
        DatabaseMetaData metaData = dataSource.getConnection().getMetaData();

        System.out.println( metaData.getDriverName() );
        System.out.println( metaData.getUserName() );
    }

    @Test
    public void insert() {
        Users users = new Users();

    }
}