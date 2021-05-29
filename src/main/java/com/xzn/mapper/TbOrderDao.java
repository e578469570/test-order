package com.xzn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xzn.pojo.TbOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderDao extends BaseMapper<TbOrder> {


    int queryCount(@Param("userId") Long userId, @Param("status") Integer status);

    List<TbOrder> queryOrderList(@Param("userId") Long userId,@Param("status")Integer status, @Param("start")int start, @Param("pageSize")Integer pageSize);
}
