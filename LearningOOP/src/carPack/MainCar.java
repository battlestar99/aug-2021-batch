package carPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class MainCar {

	public static void main(String[] args) throws AWTException {

		Car c = new Toyota();
		c.startCar();
	}

}
