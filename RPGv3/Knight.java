public class Knight extends Protagonist {
   public Knight( String hero_name) {
	super(hero_name);
	defense = 35;
    }
   public String toString() {
	   return "Knight " + name + System.lineSeparator() + super.toString();
   }

}
