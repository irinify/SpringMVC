package com.dao;

import com.entity.Rating;

public interface RatingMapper {
    int deleteByPrimaryKey(Integer ratingid);

    int insert(Rating record);

    int insertSelective(Rating record);

    Rating selectByPrimaryKey(Integer ratingid);

    int updateByPrimaryKeySelective(Rating record);

    int updateByPrimaryKey(Rating record);
}