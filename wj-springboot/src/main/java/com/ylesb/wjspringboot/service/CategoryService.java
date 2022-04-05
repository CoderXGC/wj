package com.ylesb.wjspringboot.service;
/**
 * @title: CategoryService
 * @projectName wj-springboot
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/514:51
 */

import com.ylesb.wjspringboot.dao.CategoryDAO;
import com.ylesb.wjspringboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className    : CategoryService
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/5 14:51]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/5 14:51]
 * @updateRemark : [描述说明本次修改内容] 
 */
@Service
public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    public List<Category> list() {
        //https://blog.csdn.net/qq_35953966/article/details/104061854
        //Sort sort = new Sort(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public Category get(int id) {
        Category c= categoryDAO.findById(id).orElse(null);
        return c;
    }
}
