package com.film.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.film.entity.AllEntity;
import com.film.service.AllService;
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
@RequestMapping("film/all")
public class AllController {
    @Autowired
    private AllService allService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = allService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		AllEntity all = allService.getById(id);

        return R.ok().put("all", all);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AllEntity all){
		allService.save(all);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AllEntity all){
		allService.updateById(all);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		allService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
