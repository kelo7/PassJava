package com.kelo7.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kelo7.common.utils.PageUtils;
import com.kelo7.passjava.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author kelo7
 * @email LiYue_1999@outlook.com
 * @date 2021-03-08 03:40:55
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

