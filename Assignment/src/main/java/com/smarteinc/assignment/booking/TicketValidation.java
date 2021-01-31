package com.smarteinc.assignment.booking;

import java.util.Objects;

/**
 * This class contain the common validation logic for the customer ticket
 * 
 * @author Ram
 *
 */
public abstract class TicketValidation {

	/**
	 * It contain the common validation logic for all ticket type.
	 * 
	 * @param ticket - is ticket details for the customer.
	 */
	protected void validateAllFieldsPresent(Ticket ticket) {
		Objects.requireNonNull(ticket);
		Objects.requireNonNull(ticket.getStartDate());
		Objects.requireNonNull(ticket.getEndDate());

		Objects.requireNonNull(ticket.getFrom());
		Objects.requireNonNull(ticket.getDestination());
		Objects.requireNonNull(ticket.getPassenger());

	}
}
