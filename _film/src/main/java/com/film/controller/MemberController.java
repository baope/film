package com.film.controller;

import java.util.Arrays;
import java.util.Map;


import com.auth0.jwt.interfaces.Claim;
import com.film.annotate.UsrLoginToken;
import com.film.util.JwtUtil;
import com.film.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.film.entity.MemberEntity;
import com.film.service.MemberService;
import com.common.utils.PageUtils;
import com.common.utils.R;

import javax.servlet.http.HttpServletRequest;


/**
 * 
 *
 * @author cwj
 * @email baope.ans@gmail.com
 * @date 2024-01-10 10:34:22
 */
@RestController
@RequestMapping("film/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public R signup(@RequestBody MemberVo member, HttpServletRequest httpServletRequest){
        String token = memberService.signup(member);
        return R.ok().put("token",token);
    }

    /**
     * 列表
     */
    @UsrLoginToken
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
