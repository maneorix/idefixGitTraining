package bibliotek80;
import org.deformation.utilities.*;
/**
 * hej
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
		String s = "L�ner: " + this.laaner.getNavn() + "<br /> ";
		s += "Bog: " + this.bog + "<br />";
		s += "Udl�ningsdato: " + this.datoUd + "</br >";
		s += "Afleveringsdato: " + this.datoHjem + "<br />";
		s += "B�de: " + this.boede + "<br />";
		
		return s;
	}
}