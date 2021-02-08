/**
 * 
 */
package com.ss.utopia.bookings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ss.utopia.bookings.model.Bookings;

/**
 * @author max
 *
 */
@Repository
public interface BookingsDAO extends JpaRepository<Bookings, String> {

}
