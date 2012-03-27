package bibliotek80;

import org.deformation.utilities.NewGregorianCalendar;

public class Reservation {
	private Bog bog;
	private NewGregorianCalendar dato;
	private Person laaner;
	public Reservation(Person person, Bog titel, int y, int m, int d) {
		// TODO Auto-generated constructor stub
		this.laaner=person;
		this.dato= new NewGregorianCalendar (y,m,d);
		this.bog=titel;
	
	}

}
