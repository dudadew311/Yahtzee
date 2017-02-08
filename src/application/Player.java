package application;

public class Player {
	
	private String name;
	private boolean valid = true;
	private int score;
	
	public Player(String string){
		this.name = string;
	}
	
	public Player (){
		this.name = " ";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	
}

