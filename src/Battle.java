
public class Battle {
	
	private Fighter firstPlayer, secondPlayer;
	
	public Battle(Fighter a, Fighter b){
		firstPlayer = a;
		firstPlayer = b;
	}
	
	//do we need these?
	public void startGame(){
	}
	
	public void endGame(){
	}
	
	public void firstPlayerAttack(){
		int damage;
		if(firstPlayer.inAir()){
			if((firstPlayer.getX()+firstPlayer.getAttack(0).getRange() >= secondPlayer.getX())&&(true)) //true needs to be changed to height.
			damage=firstPlayer.getAttack(0).getDamage();
		}
	}
}
