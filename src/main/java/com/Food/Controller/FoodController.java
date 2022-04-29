package com.Food.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {
	@RequestMapping("/")
	public String index()	{
		return"FPage.jsp";
	}

}