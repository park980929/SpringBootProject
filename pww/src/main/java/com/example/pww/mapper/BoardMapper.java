package com.example.pww.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mapper
public interface BoardMapper {
	
	
	
	List<Map<String, Object>> list();


}
