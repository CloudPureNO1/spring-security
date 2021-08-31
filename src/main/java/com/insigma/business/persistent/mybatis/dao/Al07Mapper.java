package com.insigma.business.persistent.mybatis.dao;

import com.insigma.business.persistent.mybatis.entity.Al07;
import java.util.List;

public interface Al07Mapper {
    int insert(Al07 record);

    List<Al07> selectAll();
}