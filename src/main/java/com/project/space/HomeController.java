package com.project.space;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	// MainHome
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Mainhome(Model model) {
		logger.info("connected Mainhome.");
		return "MainHome";
	}

	// MainHome
	@RequestMapping(value = "/MainHome", method = RequestMethod.GET)
	public String MainHome(Model model) {
		logger.info("connected MainHome.");
		return "MainHome";
	}
	
	// Home
	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("connected Home.");
		return "ajax/Home";
	}
	

	//Reservation
	@RequestMapping(value = "/Reservation", method = RequestMethod.GET)
	public String services(Model model) {
		logger.info("connected Reservation.");
		return "ajax/Reservation";
	}

	//Services
	@RequestMapping(value = "/Services", method = RequestMethod.GET)
	public String Services(Model model) {
		logger.info("connected Services.");
		return "ajax/Services";
	}

	//Contact
	@RequestMapping(value = "/Contact", method = RequestMethod.GET)
	public String contact(Model model) {
		logger.info("connected contact.");
		return "ajax/Contact";
	}

	//Mypage mapping 안됐음
	@RequestMapping(value = "/MyPage", method = RequestMethod.GET)
	public String mypage(Model model) {
		logger.info("connected mypage.");
		return "MyPage";
	}

	//MyReservation mapping 안됐음
	@RequestMapping(value = "/MyReservation", method = RequestMethod.GET)
	public String myreservation(Model model) {
		logger.info("connected myreservation.");
		return "MyReservation";
	}
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String mylogin(Model model) {
		logger.info("connected Login.");
		return "ajax/Login";
	}

}
