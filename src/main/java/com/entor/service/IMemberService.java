package com.entor.service;

import com.entor.entity.Member;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fzg
 * @since 2020-01-03
 */
public interface IMemberService extends IService<Member> {

	public Member login(String username,String password);
	
}
