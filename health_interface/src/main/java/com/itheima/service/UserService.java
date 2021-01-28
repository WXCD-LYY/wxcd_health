package com.itheima.service;

import com.itheima.pojo.User;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/1/26/026 20:24
 **/
public interface UserService {
    public User findByUsername(String username);
}
