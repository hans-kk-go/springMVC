package com.has.UserdaoDemo;

//import jdk.internal.loader.URLClassPath;
import com.has.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.has.service.Impl.UserServiceImpl;

public class UserDaoMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aplicationContext.xml");
//        UserService userService = (UserService) applicationContext.getBean("userService");
        UserService userService = applicationContext.getBean(UserServiceImpl.class);
        userService.save();
    }
}
