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
	public String doC(Model model) {//�� model��ü
		ProductVO product = new ProductVO("Sample Product", 10000); 
		MemberVO member =new MemberVO();
		member.setUserid("id");
		member.setUserpw("123");
		logger.info("doD called................");

		model.addAttribute(product);//��ü�� ��Ƽ� �Ѱ��ش�.
		model.addAttribute(member);//��ü�� ��Ƽ� �Ѱ��ش�.
		return "productDetail";
	}
}
