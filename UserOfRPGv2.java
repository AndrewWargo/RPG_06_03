public class UserOfRPGv2 {
    public static void main(String[] args) {

	//Prediction: Array of Monster cannot store instances of Protagonist
	// $ javac UserOfRPGv2.java
	// UserOfRPGv2.java:7: error: incompatible types: Protagonist cannot be converted to Monster
	//         agents[0] = new Protagonist("Hero");
	//                     ^

	// 4 errors - only 1 is shown above

	Monster[] agents = new Monster[8];
	//Character[] agents = new Character[8];
	// agents[0] = new Protagonist("Hero");
	// agents[1] = new Warrior("Hero1");
	// agents[2] = new Knight("Hero2");
	// agents[3] = new Mage("Hero3");
	agents[4] = new Monster();
	agents[5] = new Goblin();
	agents[6] = new Skeleton();
	agents[7] = new Zombie();

        int index = 0;
	while (index < agents.length){
	    System.out.println(agents[index]);
	    index++;
	}

	//Prediction: cannot find symbol error
	// 	$ javac UserOfRPGv2.java
	// UserOfRPGv2.java:32: error: cannot find symbol
	//             System.out.println(agents[index].getName());
	//                                             ^
	//   symbol:   method getName()
	//   location: class Monster
	// 1 error

	index = 0;
	while (index < agents.length){
	    System.out.println(agents[index].getName());
	    index++;
	}	
    }
}
