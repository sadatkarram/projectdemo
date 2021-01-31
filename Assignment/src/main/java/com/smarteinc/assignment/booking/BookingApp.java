package com.smarteinc.assignment.booking;

/**
 * This class is responsible for booking car/bus ticket for customer
 * 
 * @author Ram
 *
 */
public class BookingApp {

	/**
	 * This is one entry point for booking ticket for the customer
	 * 
	 * @param x - is ticket details for the customer.
	 * @return Integer as ticket type.
	 */
	public int bookingProcess(Ticket x) {
		int ticketType = x.getType();
		if (ticketType == 1) {
			// Bus Booking
			new BusBooking().bookTicket(x);
		} else if (ticketType == 2) {
			// Car Booking
			new CarBooking().bookTicket(x);
		} else if (ticketType != 1 && ticketType != 2) {
			// Invalid request 
			throw new IllegalArgumentException("Only type 1 and 2 tickets are supported");
		}
		// method should return the type of ticket booked
		return ticketType;
	}
}
