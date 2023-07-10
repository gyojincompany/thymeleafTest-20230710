package com.gyojincompany.home;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.home.dto.MemberDto;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/hello")
	public String hello(Model model) {
		
		model.addAttribute("text", "HelloWorld!!");
		
		return "helloworld";
	}
	
	@RequestMapping(value = "/hyper")
	public String hyper(Model model) {
		
		
		
		return "hyperlinkTest";
	}
	
	@RequestMapping(value = "/hyperResult")
	public String hyperResult(Model model, HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "hyperResult";
	}
	
	@RequestMapping(value = "/member")
	public String member(Model model) {
		
		MemberDto memberDto = new MemberDto("tiger", "홍길동", "tiger@abc.com", 27);
		
		model.addAttribute("memberDto", memberDto);
		
		return "member";
	}
	
	@RequestMapping(value = "/memberList")
	public String memberlist(Model model) {
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		
		for(int i=1;i<=10;i++) {
			MemberDto memberDto = new MemberDto();
			memberDto.setId("tiger"+i);
			memberDto.setName("홍길동"+i);
			memberDto.setEmail("tiger"+i+"@abc.com");
			memberDto.setAge(i+20);
			
			memberDtos.add(memberDto);
		}
		
		model.addAttribute("memberDtos", memberDtos);
		
		return "memberlist";		
	}
	
	@RequestMapping(value = "/iftest")
	public String iftest(Model model) {
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		
		for(int i=1;i<=10;i++) {
			MemberDto memberDto = new MemberDto();
			memberDto.setId("tiger"+i);
			memberDto.setName("홍길동"+i);
			memberDto.setEmail("tiger"+i+"@abc.com");
			memberDto.setAge(i+20);
			
			memberDtos.add(memberDto);
		}
		
		model.addAttribute("memberDtos", memberDtos);
		
		return "iftest";		
	}
	

}
