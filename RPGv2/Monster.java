
public class Monster extends Character {
	
    public Monster(){
	HP = 150;
	strength = (int)(Math.random() * 45) + 20;
	defense = 20;
	attackRating = 1;
    }

    public String toString(){
	String monsterCard = "Remaining HP: " + HP + System.lineSeparator() +
	              "Monster's Strength: " + strength + System.lineSeparator() +
	              "Monster's defense: " + defense + System.lineSeparator() +
	              "Attack Rating: " + attackRating + System.lineSeparator();
	return monsterCard;
    }

}
