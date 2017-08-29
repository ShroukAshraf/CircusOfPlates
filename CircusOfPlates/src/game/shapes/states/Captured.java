package game.shapes.states;

import game.shapes.Shape;

public class Captured extends State{
	
	public Captured() {
		super();
		state = "Captured";
	}

	@Override
	public int getUpdatedX() {
		return 0;
	}

	@Override
	public int getUpdatedY() {
		return 0;
	}

	@Override
	public boolean updateCoor(int moveSpeed, int x, int y, int beltLength) {
		return false;
	}

	@Override
	public void updateSate(Shape shape) {

	}
}
