package com.zjj.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zjj.mybatis.pojo.User01;

public interface User01Mapper {
	
	@Select("select *from user01")
	public List<User01> selectAll() throws Exception;

}
