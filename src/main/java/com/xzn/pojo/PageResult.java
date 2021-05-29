package com.xzn.pojo;

import lombok.Data;

import java.util.List;

@Data
public class PageResult {

    private List<TbOrder> list;
    private Integer total;
    private Integer totalPage;
}
