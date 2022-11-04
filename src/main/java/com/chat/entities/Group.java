package com.chat.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Group {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="image")
	private String image;
	
	@ManyToMany
	@JoinTable(
	  name = "groups", 
	  joinColumns = @JoinColumn(name = "group_id"), 
	  inverseJoinColumns = @JoinColumn(name = "user_id"))
	Set<User> users;
	

}
