package com.kelo7.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kelo7.common.utils.PageUtils;
import com.kelo7.passjava.question.entity.TypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author kelo7
 * @email LiYue_1999@outlook.com
 * @date 2021-03-08 03:40:55
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

