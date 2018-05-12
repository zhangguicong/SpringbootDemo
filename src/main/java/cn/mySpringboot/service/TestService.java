package cn.mySpringboot.service;

import cn.mySpringboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    private static List<User> userList = new ArrayList<>();
    static{
        for (int i = 0; i <10 ; i++) {
            User user = new User("userId_" + i,"user_" + i, i,"address_"+i);
            userList.add(user);
        }
    }
    public User getUserById(String userId) {
        User user = new User();

        user.setUserId("110");
        user.setAge(26);
        user.setAddress("杭州");
        user.setUsername("JACK");
        return user;
    }
}
