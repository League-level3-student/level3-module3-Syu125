package _01_AnimalFarm;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class Pig extends Animal {

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		AudioClip p = JApplet.newAudioClip(getClass().getResource("pig.wav"));
		p.play();
	}

	@Override
	void diet() {
		// TODO Auto-generated method stub
		System.out.println("Pig: grasses, leaves, roots, fruits, and flowers");
	}

}
