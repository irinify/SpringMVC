package com.dao;

import com.entity.Suprating;

public interface SupratingMapper {
    int deleteByPrimaryKey(Integer supratingid);

    int insert(Suprating record);

    int insertSelective(Suprating record);

    Suprating selectByPrimaryKey(Integer supratingid);

    int updateByPrimaryKeySelective(Suprating record);

    int updateByPrimaryKey(Suprating record);
}