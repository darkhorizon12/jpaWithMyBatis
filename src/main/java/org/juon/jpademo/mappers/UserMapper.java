package org.juon.jpademo.mappers;

import org.juon.jpademo.users.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();

    User findByUserName(String userName);
}
