package com.has.service.Impl;

import com.has.dao.UserDao;
import com.has.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired //按照数据类型从spring容器中进行匹配的
    @Qualifier("userDao") //是按照id值从容器中进行匹配的，但是此处@Qualifier结合@Autowired一起用
    private UserDao userDao;
//    private String name;
//    private int age;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public void setUserDao(UserDao userDao1) {
//        this.userDao = userDao1;
//    }

//    public UserServiceImpl(UserDao userDao){
//        this.userDao = userDao;
//    }


    //    @Override
    public void save() {
        userDao.save();
//        System.out.println(age + name);

    }
}
