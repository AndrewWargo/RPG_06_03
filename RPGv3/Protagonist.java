
public abstract class Protagonist extends Character {
	
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
	
	abstract void specialize();
	
	abstract void normalize();

       public abstract String toString(){
	String playerCard =  "Remaining HP: " + HP + System.lineSeparator() +
	              "Strength: " + strength + System.lineSeparator() +
	              "Defense: " + defense + System.lineSeparator() +
	              "Attack Rating: " + attackRating + System.lineSeparator();
	return playerCard;
    }
}
