package application;

public class Die {

	private int side;
	private boolean roll;
	
	public Die(){
		this.side = (int)(Math.random() * 6) + 1;
		roll = true;
	}

	public int getSide() {
		return side;
	}

	public boolean isRoll() {
		return roll;
	}

	public void setRoll(boolean roll) {
		this.roll = roll;
	}

	public void setSide() {
		if(roll){
			this.side = (int)(Math.random() * 6) + 1;
		}
	}
}
