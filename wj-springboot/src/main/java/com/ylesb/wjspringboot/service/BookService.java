package com.ylesb.wjspringboot.service;
/**
 * @title: BookService
 * @projectName wj-springboot
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/514:56
 */

import com.ylesb.wjspringboot.dao.BookDAO;
import com.ylesb.wjspringboot.pojo.Book;
import com.ylesb.wjspringboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className    : BookService
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/5 14:56]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/5 14:56]
 * @updateRemark : [描述说明本次修改内容] 
 */

@Service
public class BookService {
    @Autowired
    BookDAO bookDAO;
    @Autowired
    CategoryService categoryService;

    public List<Book> list() {
        return bookDAO.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public void addOrUpdate(Book book) {
        bookDAO.save(book);
    }

    public void deleteById(int id) {
        bookDAO.deleteById(id);
    }

    public List<Book> listByCategory(int cid) {
        Category category = categoryService.get(cid);
        return bookDAO.findAllByCategory(category);
    }
}
