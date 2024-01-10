package com.film.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.utils.PageUtils;
import com.common.utils.Query;

import com.film.dao.ActorDao;
import com.film.entity.ActorEntity;
import com.film.service.ActorService;


@Service("actorService")
public class ActorServiceImpl extends ServiceImpl<ActorDao, ActorEntity> implements ActorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ActorEntity> page = this.page(
                new Query<ActorEntity>().getPage(params),
                new QueryWrapper<ActorEntity>()
        );

        return new PageUtils(page);
    }

}