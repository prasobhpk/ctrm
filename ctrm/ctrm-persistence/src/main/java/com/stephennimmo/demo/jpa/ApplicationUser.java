package com.stephennimmo.demo.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="APPLICATION_USER")
public class ApplicationUser implements Serializable {
	
	private static final long serialVersionUID = -4505032763946912352L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="APPLICATION_USER_UID")
	private Long uid;
	
	@Column(name="LOGIN")
	private String login;

	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
}
