package com.smarteinc.assignment.booking;

/**
 * This service interface is responsible to handle the ticket booking for the
 * App.
 * 
 * @author Ram
 *
 */
public interface BookingProcess {

	/**
	 * This service function help in booking tickets for the customer.
	 * 
	 * @param x - is ticket details for the customer.
	 */
	public void bookTicket(Ticket x);

}
