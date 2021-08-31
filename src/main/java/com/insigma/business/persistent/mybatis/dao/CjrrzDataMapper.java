package com.insigma.business.persistent.mybatis.dao;

import com.insigma.business.persistent.mybatis.entity.CjrrzData;
import java.util.List;

public interface CjrrzDataMapper {
    int insert(CjrrzData record);

    List<CjrrzData> selectAll();
}