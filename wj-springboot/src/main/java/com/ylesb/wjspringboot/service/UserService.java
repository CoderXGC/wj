package com.ylesb.wjspringboot.service;
/**
 * @title: UserService
 * @projectName wj-springboot
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/315:12
 */

/**
 * @className    : UserService
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/3 15:12]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/3 15:12]
 * @updateRemark : [描述说明本次修改内容] 
 */
import com.ylesb.wjspringboot.dao.UserDAO;
import com.ylesb.wjspringboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username) {
        return userDAO.findByUsername(username);
    }

    public User get(String username, String password){
        return userDAO.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDAO.save(user);
    }
}

