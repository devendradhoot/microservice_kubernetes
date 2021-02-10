/**
 * rajpal.dodiya
 */
package com.yash.tech.web;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yash.tech.MicroserviceBackboneApplication;
import com.yash.tech.model.User;


@Controller
@RequestMapping("/")
public class UserController {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	private static final Logger LOGGER = LoggerFactory.getLogger(MicroserviceBackboneApplication.class);
	
	@PostMapping("/user")
	public String addUser(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String feedback,@RequestParam String phone)
	{
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		LOGGER.info("MicroController::getMessage Method call   :: " + sdf.format(timestamp));
		User user = new User();
	    user.setFirstName(firstName);
	    user.setLastName(lastName);
	    user.setPhone(Long.parseLong(phone));
	    user.setFeedback(feedback);
    	LOGGER.info(user.toString());
			return "success";
		
	}
 
 @GetMapping("/")
 public String entryPoint()
 {
 return "index";
 }
 
}
