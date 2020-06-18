package zyh.dao;

import org.springframework.stereotype.Repository;
import zyh.pojo.User;

@Repository
public interface UserMapper {
    User userLogin(User user);

    void insertUser(User user);


}
