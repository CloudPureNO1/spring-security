package com.insigma.business.persistent.mybatis.dao;

import com.insigma.business.persistent.mybatis.entity.Al08;
import java.util.List;

public interface Al08Mapper {
    int insert(Al08 record);

    List<Al08> selectAll();
}