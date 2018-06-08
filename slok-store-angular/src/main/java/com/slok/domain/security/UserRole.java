package com.slok.domain.security;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_role")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 7868768L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userRoleID;
	
	public UserRole () {}
	
	public UserRole (User user, Role role) {
		this.user = user;
		this.user = role;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Role role;

}
