import java.applet.AudioClip;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/** Note: You will need the latest version of the TKP jar: http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar **/

public class TurtletresureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 10;

	private void goUp() {
		
		 Tortoise.move(tortoiseSpeed);
	}

	private void goDown() {
	
		Tortoise.move(-tortoiseSpeed);
	}

	private void goLeft() {
	
	
		Tortoise.turn(-90);
		Tortoise.move(tortoiseSpeed);
		
	}

	private void goRight() {
		
		Tortoise.turn(90);
		Tortoise.move(tortoiseSpeed);
			}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		
System.out.println(tortoiseLocationX);
System.out.println(tortoiseLocationY);
	
if (tortoiseLocationX==500 && tortoiseLocationY==300)JOptionPane.showMessageDialog(null, "go too the boy");
		
if (tortoiseLocationX==140 && tortoiseLocationY==290)JOptionPane.showMessageDialog(null, "Find dory");
		
if (tortoiseLocationX==330 && tortoiseLocationY==410)JOptionPane.showMessageDialog(null, "Go to the left fire");

if (tortoiseLocationX==50 && tortoiseLocationY==190)JOptionPane.showMessageDialog(null, "Find the bottle");

if (tortoiseLocationX==290 && tortoiseLocationY==380)JOptionPane.showMessageDialog(null, "Go the the skulls right most tooth");

if (tortoiseLocationX==210 && tortoiseLocationY==120)JOptionPane.showMessageDialog(null, "Go to the stone at the right of Dory");

if (tortoiseLocationX==390 && tortoiseLocationY==380)JOptionPane.showMessageDialog(null, "Go to the middle keep out sighn");

if (tortoiseLocationX==220 && tortoiseLocationY==150)JOptionPane.showMessageDialog(null, "Find the hole");

if (tortoiseLocationX==180 && tortoiseLocationY==350){
	JOptionPane.showMessageDialog(null, "I took the Treasure while you were playing my game. muwahahahaha");
	playSound("evil.wav");
}
	}
	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new Dont_forgotTheLyrics().getClass().getResource(fileName));
		audioClip.play();
		
	}
	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want, and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground("file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null, "Ask the little girl for help with your quest. Press the space bar to ask.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TurtletresureHunt().go();
	}
}


