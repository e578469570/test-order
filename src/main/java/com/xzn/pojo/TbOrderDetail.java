package com.xzn.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

/**
 * tb_order_detail
 * @author
 */
@Data
@TableName("tb_order_detail")
public class TbOrderDetail implements Serializable {
    /**
     * 订单详情id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 订单id
     */

    @JsonSerialize(using= ToStringSerializer.class)
    private Long orderId;

    /**
     * sku商品id
     */
    private Long skuId;

    /**
     * 购买数量
     */
    private Integer num;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品动态属性键值集
     */
    private String ownSpec;

    /**
     * 价格,单位：分
     */
    private Long price;

    /**
     * 商品图片
     */
    private String image;

    private static final long serialVersionUID = 1L;
}
