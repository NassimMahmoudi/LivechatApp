package com.chat.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="image")
	private String image;
	
	@Column(name="age")
	private int age;
	
	@Column(name="status")
	private String status;
	
	@OneToMany(mappedBy="group")
	private List<Group> groups = new ArrayList<Group>();
	
	@OneToMany(mappedBy="message")
	private List<Message> messages = new ArrayList<Message>();
	
	@OneToMany(mappedBy="invitation")
	private List<Invitation> invits = new ArrayList<Invitation>();
	
}
