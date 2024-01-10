package com.film.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.film.entity.TypologyGroupEntity;
import com.film.service.TypologyGroupService;
import com.common.utils.PageUtils;
import com.common.utils.R;



/**
 * 
 *
 * @author cwj
 * @email baope.ans@gmail.com
 * @date 2024-01-10 10:34:22
 */
@RestController
@RequestMapping("film/typologygroup")
public class TypologyGroupController {
    @Autowired
    private TypologyGroupService typologyGroupService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = typologyGroupService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TypologyGroupEntity typologyGroup = typologyGroupService.getById(id);

        return R.ok().put("typologyGroup", typologyGroup);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TypologyGroupEntity typologyGroup){
		typologyGroupService.save(typologyGroup);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TypologyGroupEntity typologyGroup){
		typologyGroupService.updateById(typologyGroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		typologyGroupService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
