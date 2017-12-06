
public class Mage extends Protagonist {
    public Mage( String hero_name){
	super( hero_name);
	attackRating = 0.5;
    }
    
    public String toString() {
 	   return "Mage " + name + System.lineSeparator() + super.toString();
    }
}
