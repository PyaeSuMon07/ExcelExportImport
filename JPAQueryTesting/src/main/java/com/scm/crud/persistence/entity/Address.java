package com.scm.crud.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="addresses")
public class Address implements Serializable{
	
	private static final long serialVersionUID = 1L;
    
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	@Column(name="id")
	    private Long id;

		@Column(name="street")
	    private String street;
		
		 @OneToOne
		 @JoinColumn(name = "user_id")
		 private User user;

}