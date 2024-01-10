package com.film.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.utils.PageUtils;
import com.common.utils.Query;

import com.film.dao.TypologyGroupAttrDao;
import com.film.entity.TypologyGroupAttrEntity;
import com.film.service.TypologyGroupAttrService;


@Service("typologyGroupAttrService")
public class TypologyGroupAttrServiceImpl extends ServiceImpl<TypologyGroupAttrDao, TypologyGroupAttrEntity> implements TypologyGroupAttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TypologyGroupAttrEntity> page = this.page(
                new Query<TypologyGroupAttrEntity>().getPage(params),
                new QueryWrapper<TypologyGroupAttrEntity>()
        );

        return new PageUtils(page);
    }

}