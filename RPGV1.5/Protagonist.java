
public class Protagonist extends Character {
	
	private String name;
	
	public Protagonist( String hero_name){
		name = hero_name;
		HP = 125;
		strength = 100;
		defense = 35;
		attackRating = 0.4;
	}
	
	public String getName(){
		return name;
	}
	
	public void specialize(){
		attackRating = .6;
		defense = 20;
	}

	public void normalize(){
		defense = 40;
		attackRating = 0.4;
   }

}
