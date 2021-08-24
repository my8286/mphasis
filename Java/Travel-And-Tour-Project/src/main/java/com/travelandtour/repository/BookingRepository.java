package com.travelandtour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.travelandtour.model.*;
import com.travelandtour.dataclass.*;

public interface BookingRepository extends JpaRepository<Booking,Long> {
	//Booking findByUserId(Long id);
	
	

}
