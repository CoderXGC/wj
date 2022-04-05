package com.ylesb.wjspringboot.pojo;
/**
 * @title: Category
 * @projectName wj-springboot
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/514:47
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

/**
 * @className    : Category
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/5 14:47]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/5 14:47]
 * @updateRemark : [描述说明本次修改内容] 
 */


@Entity
@Table(name = "category")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
