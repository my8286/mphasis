package com.travelandtour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.travelandtour.model.*;
import com.travelandtour.dataclass.*;

public interface BookingRepository extends JpaRepository<Booking,Long> {
	@Query("SELECT new com.travelandtour.dataclass.BookingDto (p.firstName, p.lastName) "
			+ "FROM Booking b JOIN b.passenger p")
	List<BookingDto> fetchBookingData();
	
	@Query(value = "SELECT * FROM Bookings b WHERE b.user_id =?1", nativeQuery = true)
	List<Booking> fetchAllBookings(Integer userid);
}
