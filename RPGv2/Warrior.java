public class Warrior extends Protagonist{
    public Warrior(String hero_name){
	super(hero_name);
        strength = 125;
    }
    public String toString() {
 	   return "Warrior " + name + System.lineSeparator() + super.toString();
    }
}