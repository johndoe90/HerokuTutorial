package com.example.tutorial.config;

import javax.inject.Inject;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.example.tutorial.domain.Person;
import com.example.tutorial.repository.PersonRepository;

@Component
public class DataInit implements InitializingBean{

	@Inject
	private PersonRepository personRepo;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("\n\nINITIALIZING DATA\n\n");
		
		personRepo.save(new Person("Andrea"));		
		personRepo.save(new Person("Phillip"));		
		personRepo.save(new Person("Bruno"));		
		personRepo.save(new Person("Stephy"));		
		personRepo.save(new Person("Josef"));		
	}

}
