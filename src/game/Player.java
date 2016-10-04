package game;

public class Player {
	
	
	private String name;
	private int point = 0;
	private boolean isTurn;
	private boolean double6 = false;
	
	
	public Player (String playerName){
		name=playerName;
	}
	
	
	public void setDouble6(boolean six){
		double6 =six;
	}
	public boolean getDouble6(){
		return double6;
	}
	
	
	public void setisTurn (boolean turn){
		isTurn=turn;
	}
	public boolean getisTurn(){
		return isTurn;
	}
	
	
	public void setPoints(int points){
		point=points;
	}
	public void addPoints (int points){
		point=points+point;
	}
	public int getPoints(){
		return point;
	}	
}
