package com.entor.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entor.entity.Member;
import com.entor.service.IMemberService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fzg
 * @since 2020-01-03
 */
@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private IMemberService memberService;
	
	@RequestMapping("/login")
	public String login(String username,String password,Map<String,Object> map) {
		 Member m = memberService.login(username, password);
		 map.put("m", m);
		return "/index";
	}
	
	@RequestMapping("/logins")
	public String logins() {
		return "/login";
	}
	
	@RequestMapping("/queryPage")
	@ResponseBody
	public Map<String,Object> queryPage(
			@RequestParam(value="page",defaultValue="1")int pageNum,
			@RequestParam(value="limit",defaultValue="20")int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Member> list = memberService.list();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code",0);
		map.put("msg", "");
		map.put("data", list);
		return map;
	}
}

