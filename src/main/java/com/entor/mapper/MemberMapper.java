package com.entor.mapper;

import com.entor.entity.Member;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fzg
 * @since 2020-01-03
 */
public interface MemberMapper extends BaseMapper<Member> {
	
	@Select("select * from member where member_username=#{username} and member_password=#{password}")
	public Member login(@Param("username")String username,@Param("password")String password);

}
