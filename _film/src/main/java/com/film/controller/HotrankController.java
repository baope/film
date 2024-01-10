package com.film.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.film.entity.HotrankEntity;
import com.film.service.HotrankService;
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
@RequestMapping("film/hotrank")
public class HotrankController {
    @Autowired
    private HotrankService hotrankService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = hotrankService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		HotrankEntity hotrank = hotrankService.getById(id);

        return R.ok().put("hotrank", hotrank);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HotrankEntity hotrank){
		hotrankService.save(hotrank);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HotrankEntity hotrank){
		hotrankService.updateById(hotrank);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		hotrankService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
