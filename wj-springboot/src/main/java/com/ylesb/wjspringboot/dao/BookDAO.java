package com.ylesb.wjspringboot.dao;
/**
 * @title: CategoryDAO
 * @projectName wj-springboot
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/514:49
 */

import com.ylesb.wjspringboot.pojo.Book;
import com.ylesb.wjspringboot.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @className    : CategoryDAO
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/5 14:49]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/5 14:49]
 * @updateRemark : [描述说明本次修改内容] 
 */

public interface BookDAO extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}