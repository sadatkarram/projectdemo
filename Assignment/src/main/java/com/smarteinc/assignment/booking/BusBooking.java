package com.smarteinc.assignment.booking;

/**
 * This class is responsible to handle ticket booking for the Bus.
 * 
 * @author Ram
 *
 */
public class BusBooking extends TicketValidation implements BookingProcess {

	@Override
	public void bookTicket(Ticket x) {
		/*
		 * Instead of common validation, bus specific validation can also be used using
		 * validateAllFieldsPresentForBus()
		 */
		validateAllFieldsPresent(x);
		bookBusTicket(x);
		new MailSenderService().sendTicketBookedMail(x);
	}

	/**
	 * It contain the business logic to process Bus ticket
	 * 
	 * @param x - is bus ticket details for the customer.
	 */
	private void bookBusTicket(Ticket x) {
		// Add domain business logic for booking Bus ticket
	}
	
	/**
	 * OPTIONAL, It contain the Bus ticket specific validation for customer ticket.
	 * 
	 * @param ticket - is ticket details for the customer.
	 */
	/*
	 * @Override 
	 * protected void validateAllFieldsPresent(Ticket ticket) {
	 *  	
	 *  // Bus specific ticket validation
	 *   
	 *  }
	 */
}
