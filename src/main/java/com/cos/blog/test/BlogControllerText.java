package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test/")
public class BlogControllerText {
	
	@GetMapping("/test/hello")
	public String Hello() {
		return "<h1>hello spring boot</h1>";
	}
}
