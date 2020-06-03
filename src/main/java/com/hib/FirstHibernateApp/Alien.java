package com.hib.FirstHibernateApp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "A")
public class Alien {

	@Id
	private int id;
	private AlienName name;
	private String color;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AlienName getName() {
		return name;
	}
	public void setName(AlienName name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
