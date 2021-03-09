package com.kelo7.passjava.question.dao;

import com.kelo7.passjava.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author kelo7
 * @email LiYue_1999@outlook.com
 * @date 2021-03-08 03:40:55
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
