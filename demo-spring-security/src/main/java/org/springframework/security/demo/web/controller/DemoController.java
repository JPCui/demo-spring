package org.springframework.security.demo.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	private static Logger logger = Logger.getLogger(DemoController.class);

	@RequestMapping("/forward")
	public ModelAndView forward(String value) {
		ModelAndView model = new ModelAndView("/" + value);
		model.addObject("value", value);
		return model;
	}

	@RequestMapping("/login")
	public ModelAndView login(String value) {
		logger.info(value);
		ModelAndView model = new ModelAndView("/login");
		model.addObject("value", value);
		return model;
	}
	
	@RequestMapping("/login-processing-url")
	public ModelAndView login_processing_url(String value) {
		logger.info(value);
		ModelAndView model = new ModelAndView("/login");
		model.addObject("value", value);
		return model;
	}

	@RequestMapping("/index")
	public ModelAndView index(String value) {
		ModelAndView model = new ModelAndView("/index");
		model.addObject("value", value);
		return model;
	}

	@RequestMapping("/web1")
	@ResponseBody
	public String web1() {
		return "web 1";
	}

	@RequestMapping("/web2")
	@ResponseBody
	public String web2() {
		return "web 2";
	}

}
