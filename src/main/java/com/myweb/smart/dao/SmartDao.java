package com.myweb.smart.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;

import com.myweb.smart.dto.InoutDto;
import com.myweb.smart.dto.ProcessDto;
import com.myweb.smart.dto.ProductDto;
import com.myweb.smart.dto.WorkDto;

@Mapper
public interface SmartDao {

	@Select("select * from tbl_product_01")
	public List<ProductDto> getInpuiry() throws DataAccessException;

	@Select("select w.w_workno, p.p_code, p.p_name, p.p_size, p.p_type, w.w_quentity, w.w_workdate \r\n"
			+ "from tbl_product_01 p\r\n"
			+ "join tbl_worklist_01 w on p.p_code = w.p_code")
	public List<WorkDto> getWork() throws DataAccessException;

	@Insert("insert into tbl_process_01 (w_workno,p_p1,p_p2,p_p3,p_p4,p_p5,p_p6,w_lastdate,w_lasttime) "
			+ "value (#{w_workno},#{p_p1},#{p_p2},#{p_p3},#{p_p4},#{p_p5},#{p_p6},#{w_lastdate},#{w_lasttime})")
	public void getRefist(InoutDto dto) throws DataAccessException;

	@Select("select concat(substr(c.w_workno,1,4),'-',substr(c.w_workno,5,8))as w_workno, p.p_code, p.p_name, \r\n"
			+ "c.p_p1, c.p_p2, c.p_p3, c.p_p4, c.p_p5, c.p_p6,\r\n"
			+ "concat(date_format(c.w_lastdate, '%Y-%m-%d')) as w_lastdate, \r\n"
			+ "concat(substr(c.w_lasttime,1,2),':',substr(c.w_lasttime,3,4))as w_lasttime\r\n"
			+ "from tbl_process_01 c\r\n"
			+ "join tbl_worklist_01 w on c.w_workno = w.w_workno\r\n"
			+ "join tbl_product_01 p on p.p_code = w.p_code")
	public List<ProcessDto> getProcess() throws DataAccessException;

}
