package com.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.service.TestService;

@RestController
public class BoardController {
	
	@Autowired
	TestService testService;

//	//게시물 목록
//	@RequestMapping("list.do")
//	public ModelAndView list(@RequestParam(defaultValue="title") String searchOption,
//			@RequestParam(defaultValue="") String keyword) throws Exception{
//		List<BoardVO> list = boardService.listAll(searchOption, keyword);
//		//레코드 개수
//		int count = boardService.countArticle(searchOption, keyword);
//		ModelAndView mav = ModelAndView();
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("list", list); //list
//		map.put("count", count); //레코드의 개수
//		map.put("searchOption", searchOption); //검색 옵션
//		map.put("keyword", keyword); //검색 키워드
//		mav.addObject("map", map); //맵에 저장된 데이터를 mav에 저장
//		mav.setViewName("board/list"); //뷰를 list.jsp로 저장
//		return mav;
//	}
	
	@GetMapping("/all")
	public List<Map<String, Object>> getAll(){
		return testService.getTest();
	}
}
