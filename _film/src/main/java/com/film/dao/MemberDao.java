package com.film.dao;

import com.film.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author cwj
 * @email baope.ans@gmail.com
 * @date 2024-01-10 10:34:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
