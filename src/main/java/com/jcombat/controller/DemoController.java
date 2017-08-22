package com.jcombat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//Demo URL: http://localhost:8080/SpringSecurityOAuth/admin
public class DemoController {

	@RequestMapping("/api/admin")
	public String geAdminPage() {
		return "/secured/admin";
	}

	@RequestMapping("403page")
	public String ge403denied() {
		return "redirect:login?denied";
	}
}