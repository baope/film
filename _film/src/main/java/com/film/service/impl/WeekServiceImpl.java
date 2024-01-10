package com.film.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.utils.PageUtils;
import com.common.utils.Query;

import com.film.dao.WeekDao;
import com.film.entity.WeekEntity;
import com.film.service.WeekService;


@Service("weekService")
public class WeekServiceImpl extends ServiceImpl<WeekDao, WeekEntity> implements WeekService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WeekEntity> page = this.page(
                new Query<WeekEntity>().getPage(params),
                new QueryWrapper<WeekEntity>()
        );

        return new PageUtils(page);
    }

}