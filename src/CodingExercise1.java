import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
		Robot ada = new Robot();
		int red = 0;
		int yellow = 0;
		int blue = 0;
		int green = 0;
   	 // 3. ask the user what color they would like the Robot to draw
    		String color = JOptionPane.showInputDialog("What color do you want the robot to draw with? Your options are red, yellow, blue, or green.");
    		
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    		if (color.equals("red")) {
			ada.setPenColor(255, 0, 0);	
		}
    		else if (color.equals("green")) {
			ada.setPenColor(0, 255, 0);	
		}
    		else if (color.equals("blue")) {
			ada.setPenColor(0, 0, 255);	
		}
    		else if (color.equals("yellow")) {
			ada.setPenColor(255, 243, 0);	
		}
   	 // 2. set the pen width to 10
    		ada.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	 	ada.moveTo(300, 400);
   	 	ada.setSpeed(100);
   	 	ada.penDown();
   	 	ada.move(200);
   	 	ada.turn(90);
   	 	ada.move(200);
   	 	ada.turn(90);
   	 	ada.move(200);
	 	ada.turn(90);
	 	ada.move(200);
   	 	ada.turn(90);
   	 	ada.penUp();
    }

}