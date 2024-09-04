package com.myweb.smart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myweb.smart.dao.SmartDao;
import com.myweb.smart.dto.InoutDto;
import com.myweb.smart.dto.ProcessDto;
import com.myweb.smart.dto.ProductDto;
import com.myweb.smart.dto.WorkDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SmartService {
	
	private final SmartDao dao;
	
	public List<ProductDto> getInpuiry() {
		return dao.getInpuiry();
	}

	public List<WorkDto> getWork() {
		return dao.getWork();
	}

	public void getRegist(InoutDto dto) {
		dao.getRefist(dto);
	}

	public List<ProcessDto> getProcess() {
		return dao.getProcess();
	}
	
}
