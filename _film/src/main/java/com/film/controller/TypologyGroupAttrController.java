package com.film.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.film.entity.TypologyGroupAttrEntity;
import com.film.service.TypologyGroupAttrService;
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
@RequestMapping("film/typologygroupattr")
public class TypologyGroupAttrController {
    @Autowired
    private TypologyGroupAttrService typologyGroupAttrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = typologyGroupAttrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TypologyGroupAttrEntity typologyGroupAttr = typologyGroupAttrService.getById(id);

        return R.ok().put("typologyGroupAttr", typologyGroupAttr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TypologyGroupAttrEntity typologyGroupAttr){
		typologyGroupAttrService.save(typologyGroupAttr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TypologyGroupAttrEntity typologyGroupAttr){
		typologyGroupAttrService.updateById(typologyGroupAttr);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		typologyGroupAttrService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
