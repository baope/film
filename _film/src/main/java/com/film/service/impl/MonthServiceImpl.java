package com.film.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.utils.PageUtils;
import com.common.utils.Query;

import com.film.dao.MonthDao;
import com.film.entity.MonthEntity;
import com.film.service.MonthService;


@Service("monthService")
public class MonthServiceImpl extends ServiceImpl<MonthDao, MonthEntity> implements MonthService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MonthEntity> page = this.page(
                new Query<MonthEntity>().getPage(params),
                new QueryWrapper<MonthEntity>()
        );

        return new PageUtils(page);
    }

}