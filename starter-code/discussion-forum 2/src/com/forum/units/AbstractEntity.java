package com.forum.units;

import java.util.Date;

import com.forum.util.Utility;

public abstract class AbstractEntity {

	private Date created;
	private long id;
	
	public AbstractEntity(Date created, long id) {
		this.created = created;
		this.id = id;
	}
	
	
	/**
	 *
	 * Write a method called getId that requires no parameters and
	 * returns the id of this Abstract entity
	 *
	 * @return the id of this Abstract entity
	 */
	// Please write code for the s method here
	

	/**
	 *
	 * Write a method called setId that takes in a parameter and
	 * sets the id of this Abstract entity to the parameter.
	 *
	 * This method should return void.
	 *
	 * @param id: the id of this Abstract entity
	 */
	// Please write code for the setId method here

	
	/**
	 *
	 * Write an abstract method called autoGenerateId.
	 *
	 * This method doesn't require any parameters and returns void
	 * @return 
	 *
	 */
	// Please write code for the autoGenerateId abstract method here
	
	public abstract void autoGenerateId();
		

	public Date getCreated() {
		return created;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCreated() {
		this.created = Utility.getCurrentDate();
	}
}
