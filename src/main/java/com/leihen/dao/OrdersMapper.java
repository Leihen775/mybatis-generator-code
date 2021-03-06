package com.leihen.dao;

import com.leihen.entity.Orders;
import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(String oid);

    int insert(Orders record);

    Orders selectByPrimaryKey(String oid);

    List<Orders> selectAll();

    int updateByPrimaryKey(Orders record);
}