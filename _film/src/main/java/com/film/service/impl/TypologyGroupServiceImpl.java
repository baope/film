package com.film.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.utils.PageUtils;
import com.common.utils.Query;

import com.film.dao.TypologyGroupDao;
import com.film.entity.TypologyGroupEntity;
import com.film.service.TypologyGroupService;


@Service("typologyGroupService")
public class TypologyGroupServiceImpl extends ServiceImpl<TypologyGroupDao, TypologyGroupEntity> implements TypologyGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TypologyGroupEntity> page = this.page(
                new Query<TypologyGroupEntity>().getPage(params),
                new QueryWrapper<TypologyGroupEntity>()
        );

        return new PageUtils(page);
    }

}