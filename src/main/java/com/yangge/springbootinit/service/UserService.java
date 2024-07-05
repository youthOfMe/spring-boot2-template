package com.yangge.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangge.springbootinit.model.entity.User;

/**
* @author 20406
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-07-05 22:43:32
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);
}
