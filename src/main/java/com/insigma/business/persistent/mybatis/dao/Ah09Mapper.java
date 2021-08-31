package com.insigma.business.persistent.mybatis.dao;

import com.insigma.business.persistent.mybatis.entity.Ah09;
import java.util.List;

public interface Ah09Mapper {
    int insert(Ah09 record);

    List<Ah09> selectAll();
}