package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        
    	Robot a = new Robot();
    	a.setSpeed(50);
    	a.penDown();
    	for (int i = 0; i < 390; i++) {
    	a.move(1);
    	a.turn(360/360);
    	}
    	
    	
    	
    }
}
