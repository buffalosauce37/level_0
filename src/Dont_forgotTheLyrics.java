
import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Dont_forgotTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "You must type the word that follow the audio clip. Good Luck!");
		playSound("audio.wav");

		String x = JOptionPane.showInputDialog("Your answer");

		if (x.equals("when I see you again")) {
			JOptionPane.showMessageDialog(null, "You have the memory of an Elephant.");
		}

		else {
			JOptionPane.showMessageDialog(null, "You have a brain the size of a wallnut the answer was when I see you again");
		}
		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new Dont_forgotTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}
