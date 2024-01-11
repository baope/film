package com.film.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.film.util.JwtUtil;
import com.film.vo.MemberVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.common.utils.PageUtils;
import com.common.utils.Query;

import com.film.dao.MemberDao;
import com.film.entity.MemberEntity;
import com.film.service.MemberService;


@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, MemberEntity> implements MemberService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberEntity> page = this.page(
                new Query<MemberEntity>().getPage(params),
                new QueryWrapper<MemberEntity>()
        );

        return new PageUtils(page);
    }

    public Boolean isexist(Long userId){
        MemberEntity memberEntity = this.getOne(new LambdaQueryWrapper<MemberEntity>().eq(
                MemberEntity::getUsername, userId
        ));
        System.out.println(memberEntity.getUsername());
        return memberEntity == null? true: false;
    }


    public String signup(MemberVo member)
    {
        MemberEntity memberEntity = this.getOne(new LambdaQueryWrapper<MemberEntity>().eq(
                MemberEntity::getUsername, member.getUser()
        ));

        if(memberEntity != null)
        {
            return "";
        }

        MemberEntity memberEntity1 = new MemberEntity();

        memberEntity1.setPassword(member.getPassword());
        memberEntity1.setUsername(member.getUser());

        this.save(memberEntity1);

        return JwtUtil.createToken(memberEntity1.getUsername());

    }


}