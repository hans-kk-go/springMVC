package com.has.dao.Imol;

import com.has.dao.UserDao;
import com.has.models.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Repository("userDao")
public class UserDaoImpl implements UserDao {


    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
//        System.out.println(strList);
//        System.out.println(userMap);
//        System.out.println(properties);
        System.out.println("hello good time today");
    }
}
