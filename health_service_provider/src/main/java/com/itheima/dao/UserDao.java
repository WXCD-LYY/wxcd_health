package com.itheima.dao;

import com.itheima.pojo.User;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/1/27/027 13:08
 **/
public interface UserDao {

    public User findByUsername(String username);
}
