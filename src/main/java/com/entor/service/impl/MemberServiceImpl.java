package com.entor.service.impl;

import com.entor.entity.Member;
import com.entor.mapper.MemberMapper;
import com.entor.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fzg
 * @since 2020-01-03
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

	@Autowired
	private MemberMapper memberMapper;
	@Override
	public Member login(String username, String password) {
		return memberMapper.login(username, password);
	}

}
