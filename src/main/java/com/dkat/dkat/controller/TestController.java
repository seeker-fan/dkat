package com.dkat.dkat.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author Fan.W
 * @since 1.8
 */
@Controller
public class TestController {

	@GetMapping("/test")
	public String test(HttpServletRequest request) {
		return "index";
	}

	@GetMapping("/page1")
	public String page1(HttpServletRequest request) {
		return "profuile";
	}

	@GetMapping("/page2")
	public String page2(HttpServletRequest request) {
		return "products";
	}

	@GetMapping("/page3")
	public String page3(HttpServletRequest request) {
		return "news";
	}

	@GetMapping("/page4")
	public String page4(HttpServletRequest request) {
		return "join";
	}

	@GetMapping("/page5")
	public String page5(HttpServletRequest request) {
		return "about";
	}
}
