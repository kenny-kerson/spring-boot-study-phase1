package com.kenny.kabang.springbootstudyphase1.repository;

import com.kenny.kabang.springbootstudyphase1.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
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