package Entities;

import Util.Predator;
import Util.Prey;

public class Fish implements Prey, Predator{

	@Override
	public void hunt() {
		System.out.println("This fish is hounting smaller fish");
		
	}

	@Override
	public void flee() {
		System.out.println("This fish is fleeing from a larger fish");
		
	}
	
	

}
