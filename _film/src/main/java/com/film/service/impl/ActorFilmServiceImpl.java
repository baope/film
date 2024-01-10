package com.film.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.utils.PageUtils;
import com.common.utils.Query;

import com.film.dao.ActorFilmDao;
import com.film.entity.ActorFilmEntity;
import com.film.service.ActorFilmService;


@Service("actorFilmService")
public class ActorFilmServiceImpl extends ServiceImpl<ActorFilmDao, ActorFilmEntity> implements ActorFilmService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ActorFilmEntity> page = this.page(
                new Query<ActorFilmEntity>().getPage(params),
                new QueryWrapper<ActorFilmEntity>()
        );

        return new PageUtils(page);
    }

}