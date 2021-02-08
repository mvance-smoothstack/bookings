/**
 * 
 */
package com.ss.utopia.bookings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.utopia.bookings.dao.BookingsDAO;

/**
 * @author max
 *
 */
@Service
public class BookingsService {
	
	@Autowired
	private BookingsDAO bookingsDAO;
	
}
