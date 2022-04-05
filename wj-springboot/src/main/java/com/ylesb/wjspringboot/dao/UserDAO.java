package com.ylesb.wjspringboot.dao;
/**
 * @title: UserDAO
 * @projectName wj-springboot
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/315:10
 */

/**
 * @className    : UserDAO
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/3 15:10]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/3 15:10]
 * @updateRemark : [描述说明本次修改内容] 
 */
import com.ylesb.wjspringboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
