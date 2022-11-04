package com.chat.entities;

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

import org.hibernate.annotations.ManyToAny;

@Entity
public class Invitation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="status")
	private String status;
	
	@ManyToMany
	@JoinTable(
	  name = "invits", 
	  joinColumns = @JoinColumn(name = "invitation_id"), 
	  inverseJoinColumns = @JoinColumn(name = "user_id"))
	Set<User> users;
}
