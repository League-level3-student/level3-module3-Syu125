package _01_AnimalFarm;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class Horse extends Animal{

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		AudioClip h = JApplet.newAudioClip(getClass().getResource("horse.wav"));
		h.play();
	}

	@Override
	void diet() {
		// TODO Auto-generated method stub
		System.out.println("Horse: pasture grass, tender plants, hay, grains, salt, and fruits");
	}

}
