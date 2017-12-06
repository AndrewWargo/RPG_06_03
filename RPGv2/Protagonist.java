
public class Protagonist extends Character {
	
	public String name;
	
	public Protagonist( String hero_name){
		name = hero_name;
		HP = 125;
		strength = 100;
		defense = 25;
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

       public String toString(){
	String playerCard =  "Remaining HP: " + HP + System.lineSeparator() +
	              "Strength: " + strength + System.lineSeparator() +
	              "Defense: " + defense + System.lineSeparator() +
	              "Attack Rating: " + attackRating + System.lineSeparator();
	return playerCard;
    }
}
