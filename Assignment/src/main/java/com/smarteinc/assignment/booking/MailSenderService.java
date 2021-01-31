package com.smarteinc.assignment.booking;

/**
 * This class is responsible to send ticket booking confirmation mail to the
 * customer.
 * 
 * @author Ram
 *
 */
public class MailSenderService {

	/**
	 * This function send ticket booked confirmation mail to customer
	 * 
	 * @param x - is ticket details for the customer.
	 */
	void sendTicketBookedMail(Ticket x) {
		// Assume email is sent to passenger that his/her ticket is booked
		if (x.getType() == 1) {
			// Add Bus booking template body to sendMail
			sendMail();
		} else {
			// Add Car booking template body to sendMail
			sendMail();
		}
	}

	/**
	 * Send mail to customer
	 */
	private void sendMail() {
		// Common mail send logic
	}
}
