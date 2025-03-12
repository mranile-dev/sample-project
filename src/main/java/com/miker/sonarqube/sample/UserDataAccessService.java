/**
 * 
 */
package com.miker.sonarqube.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;

/**
 * 
 */
@Service
public class UserDataAccessService {

	@Autowired
	private EntityManager entityManager;
	
	public UserEntity getUser(Integer id) {
		var query = entityManager.createNativeQuery("SELECT * FROM User WHERE id = " + id);
		return (UserEntity)query.getSingleResult();
	}
}
