package bibliotek80;

import org.deformation.utilities.NewGregorianCalendar;

public class Reservation {
	private Bog bog;
	private NewGregorianCalendar dato; //supplied by teacher
	private Person laaner;


	public Reservation(Person person, Bog titel, int y, int m, int d) {
		this.laaner = person;
		this.bog = titel;
		this.dato = new NewGregorianCalendar (y,m,d);
	}
	
	public NewGregorianCalendar getDato() { 
	    return this.dato;
	}
    
	
	public String toString() {
	String s = "Reservation Dato: " + this.getDato() + "<br />";
	s += "Bog: " + this.bog + "<br />";
	s += "Laaner: " + this.laaner + "<br />";
	return s;
    }

}
