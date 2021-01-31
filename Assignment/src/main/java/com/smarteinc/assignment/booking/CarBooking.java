package com.smarteinc.assignment.booking;

/**
 * This class is responsible to handle ticket booking for the Car.
 * 
 * @author Ram
 *
 */
public class CarBooking extends TicketValidation implements BookingProcess {

	@Override
	public void bookTicket(Ticket x) {
		/*
		 * Instead of common validation, car specific validation can also be used using
		 * validateAllFieldsPresentForCar()
		 */
		validateAllFieldsPresent(x);
		bookCarTicket(x);
		new MailSenderService().sendTicketBookedMail(x);
	}

	/**
	 * It contain the business logic to process Car ticket
	 * 
	 * @param x - is car ticket details for the customer.
	 */
	private void bookCarTicket(Ticket x) {
		// Add domain business logic for booking Car ticket
	}

	/**
	 * OPTIONAL, It contain the Car ticket specific validation for customer ticket.
	 * 
	 * @param ticket - is ticket details for the customer.
	 */
	/*
	 * @Override 
	 * protected void validateAllFieldsPresent(Ticket ticket) {
	 *  	
	 *  // Car specific ticket validation
	 *   
	 *  }
	 */

}
