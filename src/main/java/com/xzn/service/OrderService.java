package com.xzn.service;

import com.xzn.mapper.TbOrderDao;
import com.xzn.pojo.PageResult;
import com.xzn.pojo.TbOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class OrderService {

    @Resource
    private TbOrderDao tbOrderDao;
    @Transactional(readOnly = true)
    public PageResult queryOrderList(Long userId, Integer status, Integer pageNo, Integer pageSize) {

        PageResult pageResult = new PageResult();
        //查询总页数
        Integer total = tbOrderDao.queryCount(userId,status);
        if (total == null) {
            return null;
        }
        Integer totalPage = total % pageSize == 0 ? total / pageSize : total % pageSize * 1;

        //处理错误页码
        if (pageNo < 0) {
            pageNo = 1;
        } else if (pageNo > totalPage) {
            pageNo = totalPage;
        }
        int start = (pageNo - 1) * pageSize;

        //查出分页结果
        List<TbOrder> list = tbOrderDao.queryOrderList(userId,status, start, pageSize);
        if (list == null) {
            return null;
        }
        pageResult.setTotal(total);
        pageResult.setTotalPage(totalPage);
        pageResult.setList(list);

        return pageResult;
    }



}
