package com.entor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test1")
public class TestController {
	
	@RequestMapping("/test1")
	public String Test() {
		return "/test";
	}
	
}
