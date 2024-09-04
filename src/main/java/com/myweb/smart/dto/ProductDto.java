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
public class ProductDto {
	private String p_code;
	private String p_name;
	private String p_size;
	private String p_type;
	private int p_price;
	
}
