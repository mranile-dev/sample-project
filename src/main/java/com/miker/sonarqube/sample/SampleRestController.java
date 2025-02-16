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
		UserEntity entity = userService.getUser(id);
		return "Hello " + entity.getFirstName() + " " + entity.getLastName();
	}
}
