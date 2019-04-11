package _01_AnimalFarm;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class Chicken extends Animal {

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		AudioClip ch = JApplet.newAudioClip(getClass().getResource("chicken.wav"));
		ch.play();
	}

	@Override
	void diet() {
		// TODO Auto-generated method stub
		System.out.println("Chicken: Grains, fruits, seeds");
	}

}
