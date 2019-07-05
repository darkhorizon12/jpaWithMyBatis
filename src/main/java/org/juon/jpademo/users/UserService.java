package org.juon.jpademo.users;

import org.juon.jpademo.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper mapper;

    public List<User> findAll() {
        return mapper.findAll();
    }

    public User findByUserName(String userName) {
        return mapper.findByUserName(userName);
    }
}
