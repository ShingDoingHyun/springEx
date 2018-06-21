package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.MemberVO;

@Controller
public class SampleController2 {

	
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg, @ModelAttribute("mem") MemberVO mem) {
		logger.info("doC called................" + msg);
		logger.info("userid = " + mem.getUserid()); //넘어온 값을 자동으로 매핑해서 객체에 담아줌
		logger.info("userpw = " + mem.getUserpw()); 
		
		return "result";
	}
}
