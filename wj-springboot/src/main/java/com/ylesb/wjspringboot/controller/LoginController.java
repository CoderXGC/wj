package com.ylesb.wjspringboot.controller;
/**
 * @title: LoginController
 * @projectName wj-springboot
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/314:40
 */

/**
 * @className    : LoginController
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/3 14:40]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/3 14:40]
 * @updateRemark : [描述说明本次修改内容] 
 */

import com.ylesb.wjspringboot.config.Result;
import com.ylesb.wjspringboot.pojo.User;
import com.ylesb.wjspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser, HttpSession session) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPassword());
        if (null == user) {
            return new Result(400);
        } else {
            session.setAttribute("user", user);
            return new Result(200);
        }
    }
}