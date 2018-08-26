package com.dao;

import com.entity.Blacklist;

public interface BlacklistMapper {
    int deleteByPrimaryKey(Integer blacklistid);

    int insert(Blacklist record);

    int insertSelective(Blacklist record);

    Blacklist selectByPrimaryKey(Integer blacklistid);

    int updateByPrimaryKeySelective(Blacklist record);

    int updateByPrimaryKey(Blacklist record);
}