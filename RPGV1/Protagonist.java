package RPGv1;

public class Protagonist extends Character {
	
	private String name;
	
	public Protagonist( String hero_name){
		name = hero_name;
		HP = 125;
		strength = 100;
		defense = 40;
		attackRating = 0.4;
	}
	
	public String getName(){
		return name;
	}
	
	public void specialize(){
		attackRating += .1;
		defense -= 10;
	}

	public void normalize(){
		defense = 40;
		attackRating = 0.4;
   }

}
