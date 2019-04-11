package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm{

	public static void main(String[] args) {
		ArrayList<Animal>farm = new ArrayList<Animal>();
		Cow c = new Cow();
		Horse h = new Horse();
		Pig p = new Pig();
		Chicken ch = new Chicken();
		farm.add(c);
		farm.add(h);
		farm.add(ch);
		farm.add(p);
		
		
		for(int i = 0; i < 4; i ++) {
			farm.get(i).makeNoise();
			farm.get(i).diet();
		}
	}

	void makeNoise() {
		// TODO Auto-generated method stub
		
	}

}
