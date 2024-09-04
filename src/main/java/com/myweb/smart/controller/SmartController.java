package com.myweb.smart.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.myweb.smart.dto.InoutDto;
import com.myweb.smart.dto.ProcessDto;
import com.myweb.smart.dto.ProductDto;
import com.myweb.smart.dto.WorkDto;
import com.myweb.smart.service.SmartService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class SmartController {
	
	private final SmartService service;
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping("/inpuiry")
	public String inpuiryPage(Model model) {
		List<ProductDto> list = service.getInpuiry();
		model.addAttribute("list",list);
		return "inpuiry";
	}
	
	@GetMapping("/work")
	public String workPage(Model model) {
		List<WorkDto> worklist = service.getWork();
		model.addAttribute("worklist",worklist);
		return "work";
	}
	
	@GetMapping("/inout")
	public String inoutPage() {
		return "inout";
	}
	
	@PostMapping("/regist")
	public String registPage(InoutDto dto) {
		service.getRegist(dto);
		return "process";
	}
	
	@GetMapping("/process")
	public String processPage(Model model) {
		List<ProcessDto> list = service.getProcess();
		model.addAttribute("list",list);
		return "process";
	}
}
