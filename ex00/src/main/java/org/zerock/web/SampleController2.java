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
		logger.info("userid = " + mem.getUserid()); //�Ѿ�� ���� �ڵ����� �����ؼ� ��ü�� �����
		logger.info("userpw = " + mem.getUserpw()); 
		
		return "result";
	}
}
