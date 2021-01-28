package com.itheima.dao;

import com.itheima.pojo.OrderSetting;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/1/21/021 19:54
 **/
public interface OrderSettingDao {
    public void add(OrderSetting orderSetting);

    public void editNumberByOrderDate(OrderSetting orderSetting);

    public long findCountByOrderDate(Date orderDate);

    public List<OrderSetting> getOrderSettingByMonth(Map map);

    public OrderSetting findByOrderDate(Date orderDate);

    public void editReservationsByOrderDate(OrderSetting orderSetting);
}
