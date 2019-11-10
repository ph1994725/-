package org.ph.Employee.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestHandler {
	
	@RequestMapping("/test1")
	public String test() {
		return "test";
	}

}
