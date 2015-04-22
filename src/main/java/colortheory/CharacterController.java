package colortheory;

import java.awt.event.KeyListener;

public abstract class CharacterController implements KeyListener {
	public double startSpeed = 0.0;
	public double currentSpeed;
	public double maxSpeed = 2.0;

	public CharacterController() {
		// TODO Auto-generated constructor stub

	}

	// method to accelerate the blob based on how long the move key is pressed
	public double accelerate() {
		if (currentSpeed <= maxSpeed) {
			currentSpeed = currentSpeed + 0.1;
		} else {

		}
		return 0;
	}

}
