package com.book.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/")
    public String home() {
        return "home";
    }
	
	 @RequestMapping("/login")
	    public String login(@RequestParam(value="error", required = false) String error, @RequestParam(value="logout",
	            required = false) String logout, Model model) {
	        if (error!=null) {
	            model.addAttribute("error", "Invalid username and password");
	        }

	        if(logout!=null) {
	            model.addAttribute("msg", "You have been logged out successfully.");
	        }

	        return "login";
	    }
	 @RequestMapping("/about")
	    public String about() {
	        return "about";
	    }

}
