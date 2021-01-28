package com.itheima.dao;

import com.itheima.pojo.Permission;

import java.util.Set;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/1/27/027 13:14
 **/
public interface PermissionDao {
    public Set<Permission> findByRoleId(Integer roleId);
}
