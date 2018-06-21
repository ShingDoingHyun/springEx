package org.zerock.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.MemberVO;

@Controller//���� ������ �ϴ� Ŭ������ �ʼ��� �޾��ش�.
public class SampleController {

	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("/doA")
	public void doA(@RequestParam String msg,  int num, MemberVO mem) {	//@RequestParam�� ���� �ʼ���Ұ� �ȴ�.                                                                                                                                                                                                                                       
		logger.info("doA called................");
		logger.info("msg = " + msg);
		logger.info("num = " + num); //front Controller���� �ڵ� ����ȯ
		logger.info("userid = " + mem.getUserid()); //�Ѿ�� ���� �ڵ����� �����ؼ� ��ü�� �����
		logger.info("userpw = " + mem.getUserpw()); 
	}
	
	@RequestMapping("/doB")
	public void doB(@RequestParam HashMap<String, String> map) {	// map���� �ϸ� �Ű����� ��ü�� �־��ش�. @RequestParam�� ����� ����. �ƴϸ� null��, �ȵ�  	
		logger.info("doB called................");
		logger.info("map_id = " + map.get("id"));
		logger.info("map_pw = " + map.get("pw"));
	}
	
	//�����α׷��� : ������ �̵��� ������ ����
}
