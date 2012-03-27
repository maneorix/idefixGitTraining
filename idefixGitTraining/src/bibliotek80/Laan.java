package bibliotek80;
import org.deformation.utilities.*;
/**
 * 
 * @author 
 *
 */
public class Laan {
	private Person laaner;
	private BogEksemplar bog;
	private NewGregorianCalendar datoUd;
	private NewGregorianCalendar datoHjem;
	private double boede;
	
	public Laan(Person laaner, BogEksemplar bog,
	NewGregorianCalendar datoUd,NewGregorianCalendar datoHjem, double boede){
		this.laaner = laaner;
		this.bog = bog;
		this.datoUd = datoUd;
		this.boede = boede;
		this.datoHjem = datoHjem;
		
	}
	
	public Person getLaaner(){
		return this.laaner;
	}
	
	public String toString(){
		String s = "Låner: " + this.laaner.getNavn() + "<br /> ";
		s += "Bog: " + this.bog + "<br />";
		s += "Udlåningsdato: " + this.datoUd + "</br >";
		s += "Afleveringsdato: " + this.datoHjem + "<br />";
		s += "Bøde: " + this.boede + "<br />";
		
		return s;
	}
}