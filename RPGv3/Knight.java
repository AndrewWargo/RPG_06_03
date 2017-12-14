public class Knight extends Protagonist {
   public Knight( String hero_name) {
	super(hero_name);
	defense = 35;
    }
   public String toString() {
	   return "Knight " + name + System.lineSeparator() + super.toString();
   }

    public void specialize(){
    	attackrating = 0.5;
	defense = 30;
    }

    public void normalize(){
	attackerating = 0.4;
	defense = 35;
    }

}
