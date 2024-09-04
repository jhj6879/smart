package com.myweb.smart.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProcessDto {
	private String w_workno;
	private String p_code;
	private String p_name;
	private String p_p1;
	private String p_p2;
	private String p_p3;
	private String p_p4;
	private String p_p5;
	private String p_p6;
	private String w_lastdate;
	private String w_lasttime;
}
