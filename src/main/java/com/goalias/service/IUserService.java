package com.goalias.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.goalias.dto.LoginFormDTO;
import com.goalias.dto.Result;
import com.goalias.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 高文升
 * @since 2021-12-22
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
