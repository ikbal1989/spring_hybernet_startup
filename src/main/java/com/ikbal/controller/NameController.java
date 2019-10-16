package com.ikbal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/name")
public class NameController {

	/**
	 * Listing Name
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {		
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("index.jsp");		
		return mv;
	}
	
	/**
	 * Create new name
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView create() {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("create.jsp");
		return mv;
	}
	
	/**
	 * Save name to database
	 */
	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public void store() {}
	
	/**
	 * Open edit form with existing name
	 */
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView edit() {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("edit.jsp");
		return mv;
	}
	
	/**
	 * Update name with modified name
	 */
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update() {}
	
	/**
	 * destroy / delete from database
	 */
	@RequestMapping(value = "/destroy", method = RequestMethod.DELETE)
	public void destroy() {}
	
	
}
