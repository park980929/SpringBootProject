package com.example.pww.board;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pww.service.BoardService;

import jakarta.annotation.Resource;

@RestController
public class BoardController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Resource	
	private BoardService boardService;

	@GetMapping("/board")
	public String board() {
		log.info("게시판 페이지");
		List<Map<String,Object>> list = boardService.list();
		log.info("게시판  list : " + list);
		
		
		return "board";
	}
}
