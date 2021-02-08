/**
 * 
 */
package com.ss.utopia.bookings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ss.utopia.bookings.service.BookingsService;

/**
 * @author max
 *
 */
@RestController
@RequestMapping("/utopia/bookings")
public class BookingsController {
	
	@Autowired
	private BookingsService bookingsService;	//pulls in the DAO
}
