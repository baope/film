package com.film.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.film.entity.ActorFilmEntity;
import com.film.service.ActorFilmService;
import com.common.utils.PageUtils;
import com.common.utils.R;



/**
 * 
 *
 * @author cwj
 * @email baope.ans@gmail.com
 * @date 2024-01-10 10:34:21
 */
@RestController
@RequestMapping("film/actorfilm")
public class ActorFilmController {
    @Autowired
    private ActorFilmService actorFilmService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = actorFilmService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		ActorFilmEntity actorFilm = actorFilmService.getById(id);

        return R.ok().put("actorFilm", actorFilm);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ActorFilmEntity actorFilm){
		actorFilmService.save(actorFilm);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ActorFilmEntity actorFilm){
		actorFilmService.updateById(actorFilm);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		actorFilmService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
