package com.yangge.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangge.springbootinit.model.entity.User;
import com.yangge.springbootinit.model.vo.LoginUserVO;
import com.yangge.springbootinit.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;

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

    /**
     * 用户登录
     *
     * @param userAccount
     * @param userPassword
     * @param request
     * @return
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获取脱敏的已登录用户信息
     *
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取脱敏的用户信息
     *
     * @param user
     * @return
     */
    UserVO getUserVO(User user);
}
