package com.insigma.business.persistent.mybatis.dao;

import com.insigma.business.persistent.mybatis.entity.Ah02;
import java.util.List;

public interface Ah02Mapper {
    int insert(Ah02 record);

    List<Ah02> selectAll();
}