package br.com.questao.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/oi")
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}
	}
