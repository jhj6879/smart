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
public class WorkDto {
	private String w_workno;
	private String p_code;
	private String p_name;
	private String p_size;
	private String p_type;
	private int w_quentity;
	private String w_workdate;
	
}
