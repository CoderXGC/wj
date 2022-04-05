package com.ylesb.wjspringboot.pojo;
/**
 * @title: Result
 * @projectName wj-springboot
 * @description: TODO
 * @author White
 * @site : [www.ylesb.com]
 * @date 2022/4/314:40
 */

/**
 * @className    : Result
 * @description  : [描述说明该类的功能]  
 * @author       : [XuGuangchao]
 * @site         : [www.ylesb.com]
 * @version      : [v1.0]
 * @createTime   : [2022/4/3 14:40]
 * @updateUser   : [XuGuangchao]
 * @updateTime   : [2022/4/3 14:40]
 * @updateRemark : [描述说明本次修改内容] 
 */

public class Result {
    //响应码
    private int code;

    public Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}

