package org.zerock.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.MemberVO;

@Controller//서블릿 역할을 하는 클래스엔 필수로 달아준다.
public class SampleController {

	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("/doA")
	public void doA(@RequestParam String msg,  int num, MemberVO mem) {	//@RequestParam를 쓰면 필수요소가 된다.                                                                                                                                                                                                                                       
		logger.info("doA called................");
		logger.info("msg = " + msg);
		logger.info("num = " + num); //front Controller에서 자동 형변환
		logger.info("userid = " + mem.getUserid()); //넘어온 값을 자동으로 매핑해서 객체에 담아줌
		logger.info("userpw = " + mem.getUserpw()); 
	}
	
	@RequestMapping("/doB")
	public void doB(@RequestParam HashMap<String, String> map) {	// map으로 하면 매개변수 전체를 넣어준다. @RequestParam를 해줘야 들어간다. 아니면 null값, 안들어감  	
		logger.info("doB called................");
		logger.info("map_id = " + map.get("id"));
		logger.info("map_pw = " + map.get("pw"));
	}
	
	//웹프로그래밍 : 페이지 이동과 데이터 전달
}
