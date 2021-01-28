package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.Setmeal;

import java.util.List;
import java.util.Map;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/1/18/018 15:57
 **/
public interface SetmealDao {
    public void add(Setmeal setmeal);

    public void setSetmealAndCheckGroup(Map map);

    public Page<Setmeal> findByCondition(String queryPageBean);

    public List<Setmeal> findAll();

    public Setmeal findById(int id);

    public Object findById4Detail(Integer id);

    public List<Map<String, Object>> findSetmealCount();

}
