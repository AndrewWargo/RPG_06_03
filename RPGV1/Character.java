package RPGv1;

public class Character {

	protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRating;
	
    public boolean isAlive(){
    	return HP > 0;
    }

    public int getDefense(){
    	return defense;
    }

    public void lowerHP(int damage){
    	HP = HP - damage;
    	if (!isAlive())
    	    System.out.println("You died");
    }

    public int attack(Character target){
    	int damage = (int)((double)strength * attackRating) - target.getDefense();
    	target.lowerHP(damage);
    	return damage;
    }
}
