package com.ust.me1;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ust.me1.dao.SuperHeroRepo;

@Controller
public class SuperHeroController {
	
	@Autowired
	SuperHeroRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/addSuperHero")
	public ModelAndView addSuperHero(SuperHero superHero) {
		ModelAndView mv = new ModelAndView("display.jsp");
		superHero = repo.save(superHero);
		mv.addObject(superHero);
		return mv;
	}
	
	@RequestMapping("/getSuperHero")
	public ModelAndView getSuperHero(@RequestParam int sId) {
		ModelAndView mv = new ModelAndView("display.jsp");
		SuperHero superHero = repo.findById(sId).orElse(new SuperHero());
		mv.addObject(superHero);
		System.out.println(repo.findBysAbility("speed"));
		System.out.println(repo.findBysIdGreaterThan(102));
		return mv;
	}
	

}
