package _01_AnimalFarm;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class Cow extends Animal{

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		AudioClip c = JApplet.newAudioClip(getClass().getResource("cow.wav"));
		c.play();
		
	}

	@Override
	void diet() {
		// TODO Auto-generated method stub
		System.out.println("Cow: grass, grains, stems and other plant materials");
	}

}
