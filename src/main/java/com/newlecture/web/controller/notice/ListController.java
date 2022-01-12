package com.newlecture.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

public class ListController implements Controller{
	
	private NoticeService noticeService;
	
	
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
//기존방식		
//		NoticeService service = new NoticeService();
		
		
		
		ModelAndView mv = new ModelAndView("notice.list");
//		mv.addObject("data", "Hello Spring Mvc~");
//		mv.setViewName("/notice/list");
		
		List<Notice> list = noticeService.getList(1, "title", "");
		mv.addObject("list", list);
		
		return mv;
	}

}
