package com.leyou.service;

import com.leyou.mapper.UserMapper;
import com.leyou.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long i) {
        User user = userMapper.selectByPrimaryKey(i);
        return user;
    }
    @Transactional
    public void deleteById(Long ids) {
        int i = userMapper.deleteByPrimaryKey(ids);
        System.out.println(i);
    }

    public List<User> queryAllUser() {
        return userMapper.selectAll();
    }
}
