package com.itheima.dao;

import com.itheima.pojo.Role;

import java.util.Set;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/1/27/027 13:11
 **/
public interface RoleDao {
    public Set<Role> findByUserId(Integer userId);
}
