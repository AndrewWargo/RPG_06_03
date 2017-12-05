public class Monster {

    private int HP;
    private int strength;
    private int defense;
    private double attackRating;

    public Monster(){
	HP = 150;
	strength = (int)(Math.random() * 45) + 20;
	defense = 20;
	attackRating = 1;
    }

    public boolean isAlive(){
	return HP > 0;
    }

    public int getDefense(){
	return defense;
    }

    public void lowerHP( int damage){
	HP = HP - damage;
    }

    public void attack(Protagonist target){
	int damage = (int)((double)strength * attackRating) - target.getDefense();
	target.lowerHP(damage);
    }

}

