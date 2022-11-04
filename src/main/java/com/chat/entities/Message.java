package com.chat.entities;

import java.util.Date;
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

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="date_send")
	private Date date_send;
	
	@Column(name="date_read")
	private Date date_read;
	
	@ManyToMany
	@JoinTable(
	  name = "userIn", 
	  joinColumns = @JoinColumn(name = "message_id"), 
	  inverseJoinColumns = @JoinColumn(name = "user_id"))
	Set<User> users;

}
