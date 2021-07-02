package com.shobhit.springmvc;

import java.awt.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shobhit.springmvc.dao.AlienDao;
import com.shobhit.springmvc.model.Alien;

@Controller
public class HomeController {
	
	@Autowired
	private AlienDao dao;
	
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name","Aliens");
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
   
	@GetMapping("getAliens")
	public String getAliens(Model m)
	{
		m.addAttribute("result", dao.getAliens());
		return "showAliens";
	}
	
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid,Model m)
	{
		m.addAttribute("result",dao.getAliens(aid));
		return "showAliens";
	}
	
	
	@RequestMapping("addAliens")
	public String addAliens(@ModelAttribute("result") Alien a)
	{
		dao.addAliens(a);
		return "showAliens";
	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("aid")int num1,@RequestParam("aname") String num2)
	{
		System.out.println(num1+"\t"+num2);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("aid", num1);
		mv.addObject("aname", num2);
		return mv;
	}
}
