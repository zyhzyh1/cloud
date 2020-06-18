package zyh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zyh.dao.UserMapper;
import zyh.pojo.User;

/**
 * @program: blue-cloud
 * @description: 用户逻辑层
 * @author: Mr.Z
 * @create: 2020-06-17 21:11
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User userLogin(User user){
        return userMapper.userLogin(user);
    }

    public void insertUser(User user){
        userMapper.insertUser(user);
    }
}
