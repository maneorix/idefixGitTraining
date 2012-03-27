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
	String s = "Dato: " + this.getDato();
	return s;
    }

}