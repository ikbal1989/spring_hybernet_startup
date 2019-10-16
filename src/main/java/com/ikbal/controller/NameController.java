package com.ikbal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/name")
public class NameController {

	/**
	 * Listing Name
	 */
	@RequestMapping("/index")
	public ModelAndView index() {		
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("index.jsp");		
		return mv;
	}
	
	/**
	 * Create new name
	 */
	@RequestMapping("/create")
	public ModelAndView create() {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("create.jsp");
		return mv;
	}
	
	/**
	 * Save name to database
	 */
	@RequestMapping("/store")
	public void store() {}
	
	/**
	 * Open edit form with existing name
	 */
	@RequestMapping("/edit")
	public ModelAndView edit() {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("edit.jsp");
		return mv;
	}
	
	/**
	 * Update name with modified name
	 */
	@RequestMapping("/update")
	public void update() {}
	
	/**
	 * destroy / delete from database
	 */
	@RequestMapping("/destroy")
	public void destroy() {}
	
	
}
