package com.film.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.film.entity.ActorFilmEntity;

import java.util.Map;

/**
 * 
 *
 * @author cwj
 * @email baope.ans@gmail.com
 * @date 2024-01-10 10:34:21
 */
public interface ActorFilmService extends IService<ActorFilmEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

