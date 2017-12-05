
public class Protagonist {

    private String name;
    private int HP;
    private int strength;
    private int defense;
    private double attackRating;

    public Protagonist( String hero_name){
	name = hero_name;
	HP = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }

    public boolean isAlive(){
	return HP > 0;
    }

    public int getDefense(){
	return defense;
    }

    public String getName(){
	return name;
    }

    public void lowerHP(int damage){
	HP = HP - damage;
	if (!isAlive())
	    System.out.println("You died");
    }

    public void attack(Monster target){
	int damage = (int)((double)strength * attackRating) - target.getDefense();
	target.lowerHP(damage);
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

