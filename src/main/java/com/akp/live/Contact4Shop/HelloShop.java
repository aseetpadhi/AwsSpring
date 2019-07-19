package com.akp.live.Contact4Shop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloShop {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Hello AWS Spring -";
	}

}
