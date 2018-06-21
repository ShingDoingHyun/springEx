package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.MemberVO;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController3 {

	
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("doD")
	public String doC(Model model) {//빈 model객체
		ProductVO product = new ProductVO("Sample Product", 10000); 
		MemberVO member =new MemberVO();
		member.setUserid("id");
		member.setUserpw("123");
		logger.info("doD called................");

		model.addAttribute(product);//객체를 담아서 넘겨준다.
		model.addAttribute(member);//객체를 담아서 넘겨준다.
		return "productDetail";
	}
}
