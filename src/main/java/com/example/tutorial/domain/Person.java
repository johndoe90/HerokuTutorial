package com.example.tutorial.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "people")
public class Person extends AbstractPersistable<Long>{
	public Person(){}
	public Person(String name){
		this.name = name;
	}
	
	@Column(name = "name")
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
