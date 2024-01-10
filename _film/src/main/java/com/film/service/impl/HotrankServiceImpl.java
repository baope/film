package com.film.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.utils.PageUtils;
import com.common.utils.Query;

import com.film.dao.HotrankDao;
import com.film.entity.HotrankEntity;
import com.film.service.HotrankService;


@Service("hotrankService")
public class HotrankServiceImpl extends ServiceImpl<HotrankDao, HotrankEntity> implements HotrankService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HotrankEntity> page = this.page(
                new Query<HotrankEntity>().getPage(params),
                new QueryWrapper<HotrankEntity>()
        );

        return new PageUtils(page);
    }

}