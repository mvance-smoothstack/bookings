/**
 * 
 */
package com.ss.utopia.bookings.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;	//likely using enough of these that importing all is fine

/**
 * @author max
 *
 */
@Entity
@Table(name = "bookings")
public class Bookings implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "is_active")
	private int isActive;
	
	/*
	 * TODO: The users_id foreign key is for the user that made the booking, but
	 * since we're not doing auth right now, for the sake of basic functionality it
	 * can be mostly ignored. But this should be expanded on when there's more time.
	 */
	@Column(name = "users_id")
	private int usersId;
	
	@ManyToMany
	//JoinTable name: the associative entity table
	//joinColumns: this entity's PK as the FK on the associative table
	//inverseJoinColumns: the other entity's PK as the FK on the associative table
	@JoinTable(name = "flights_has_bookings", joinColumns = @JoinColumn(name = "bookings_id"), inverseJoinColumns = @JoinColumn(name = "flights_id"))
	private List<Flight> flights;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getUsersId() {
		return usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	
	

}
