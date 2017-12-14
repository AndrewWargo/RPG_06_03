public class Warrior extends Protagonist{
    public Warrior(String hero_name){
	super(hero_name);
        strength = 125;
    }
    public String toString() {
 	   return "Warrior " + name + System.lineSeparator() + super.toString();
    }

    public void specialize(){
    	attackrating = 0.5;
	defense = 20;
    }

    public void normalize(){
	attackerating = 0.4;
	defense = 25;
    }
}
