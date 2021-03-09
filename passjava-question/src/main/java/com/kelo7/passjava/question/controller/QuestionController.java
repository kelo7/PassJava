package com.kelo7.passjava.question.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.kelo7.passjava.question.entity.QuestionEntity;
import com.kelo7.passjava.question.service.QuestionService;
import com.kelo7.common.utils.PageUtils;
import com.kelo7.common.utils.R;



/**
 * 
 *
 * @author kelo7
 * @email LiYue_1999@outlook.com
 * @date 2021-03-08 03:40:55
 */
@RestController
@RequestMapping("question/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("question:question:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = questionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("question:question:info")
    public R info(@PathVariable("id") Long id){
		QuestionEntity question = questionService.getById(id);

        return R.ok().put("question", question);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("question:question:save")
    public R save(@RequestBody QuestionEntity question){
		questionService.save(question);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("question:question:update")
    public R update(@RequestBody QuestionEntity question){
		questionService.updateById(question);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("question:question:delete")
    public R delete(@RequestBody Long[] ids){
		questionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
