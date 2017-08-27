package com.jcombat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/api/admin")
	public String getAdminPage() {
		return "/secured/admin";
	}
}