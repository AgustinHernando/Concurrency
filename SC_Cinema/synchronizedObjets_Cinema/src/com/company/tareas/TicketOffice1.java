package com.company.tareas;

/**
 * This class simulates a ticket office. It sell or return tickets
 * for the two cinemas
 *
 */
public class TicketOffice1 implements Runnable {

	/**
	 * The cinema 
	 */
	private CinemaInterfaz cinema;
	
	/**
	 * Constructor of the class
	 * @param cinema the cinema
	 */
	public TicketOffice1 (CinemaInterfaz cinema) {
		this.cinema=cinema;
	}
	
	/**
	 * Core method of this ticket office. Simulates selling and returning tickets
	 */
	@Override
	public void run() {
		cinema.sellTickets1(3);
		cinema.sellTickets1(2);
		cinema.sellTickets2(2);
		cinema.returnTickets1(3);
		cinema.sellTickets1(5);
		cinema.sellTickets2(2);
		cinema.sellTickets2(2);
		cinema.sellTickets2(2);
	}

}
