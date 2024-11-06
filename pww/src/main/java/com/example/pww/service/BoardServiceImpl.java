package com.example.pww.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pww.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	private final Logger log = LoggerFactory.getLogger(getClass());
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<Map<String, Object>> list() {
		log.info("ddddddd");
		return boardMapper.list();
	} 

	

}
