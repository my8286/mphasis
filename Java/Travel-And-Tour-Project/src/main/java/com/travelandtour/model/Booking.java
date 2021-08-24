package com.travelandtour.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

@Entity
@Table(name = "bookings")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "booking_id")
	private Long bookingId;
	private String journeyDate;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passenger_id", referencedColumnName = "passenger_id")
	private Passenger passengerId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "payment_id", referencedColumnName = "payment_id")
	private Payment paymentId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "transport_id", referencedColumnName = "transport_id")
	private Transport transportId;
	
	
	
	public Passenger getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Passenger passengerId) {
		this.passengerId = passengerId;
	}

	public Payment getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Payment paymentId) {
		this.paymentId = paymentId;
	}

	public Transport getTransportId() {
		return transportId;
	}

	public void setTransportId(Transport transportId) {
		this.transportId = transportId;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
