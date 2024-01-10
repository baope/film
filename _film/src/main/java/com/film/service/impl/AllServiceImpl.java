package com.film.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.utils.PageUtils;
import com.common.utils.Query;

import com.film.dao.AllDao;
import com.film.entity.AllEntity;
import com.film.service.AllService;


@Service("allService")
public class AllServiceImpl extends ServiceImpl<AllDao, AllEntity> implements AllService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AllEntity> page = this.page(
                new Query<AllEntity>().getPage(params),
                new QueryWrapper<AllEntity>()
        );

        return new PageUtils(page);
    }

}