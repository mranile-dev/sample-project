/**
 * 
 */
package com.miker.sonarqube.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 */
@RestController
public class SampleRestController {
	
	@Autowired
	private UserDataAccessService userService;
	
	@GetMapping("/hello/{id}")
	public String sayHello(@PathVariable Integer id) {
		var entity = userService.getUser(id);
		var length = welcome(entity.getFirstName()).length();
		var welcome = welcome(entity.getFirstName());
		return "Hello " + welcome + " " + entity.getLastName();
	}

	private String welcome(String name) {
	  if (name == null) {
		  System.out.println("test");
		  return null;
	  }
	  return "Welcome " + name;
	}
}
