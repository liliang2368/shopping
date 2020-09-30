package com.ly.shopping.dao.Interface;

import com.ly.shopping.dao.bo.Ordershopp;
import com.ly.shopping.dao.bo.OrdershoppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdershoppMapper {
    long countByExample(OrdershoppExample example);

    int deleteByExample(OrdershoppExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Ordershopp record);

    int insertSelective(Ordershopp record);

    List<Ordershopp> selectByExample(OrdershoppExample example);

    Ordershopp selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Ordershopp record, @Param("example") OrdershoppExample example);

    int updateByExample(@Param("record") Ordershopp record, @Param("example") OrdershoppExample example);

    int updateByPrimaryKeySelective(Ordershopp record);

    int updateByPrimaryKey(Ordershopp record);
}