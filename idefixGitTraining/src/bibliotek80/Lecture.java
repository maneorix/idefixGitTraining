package bibliotek80;

public class Lecture {

	private String title;
	private Person lecturer;
	private String description;
	private int duration; 
	
	//Constructor!
	public Lecture(){
		
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public Person getPerson(){
		return this.lecturer;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public int getDuration(){
		return this.duration;
	}
	
	/*thomas er en lort*/
}
