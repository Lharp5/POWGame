
public class Fighter {
	
		//attributes every fighter has.
	
		private String name;
		
		private BasicAttack [] attacks;
		
		private Ability [] abilities;
		private Block block;
		private int life;
		private int speed;
		private boolean air;
		
		private int xPos, yPos;
		
		//set methods for Xpos Ypos
		public void setX(int x){	xPos = x;	}
		public void setY(int y){	yPos = y;	}
		
		//getting the basic Attacks
		public BasicAttack getAttack(int i){	return attacks[i];	}
		
		//getting the ability
		public Ability getAbility(int i){	return abilities[i];	}
		
		//getting the block
		public Block getBlock(){	return block;	}
		
		//get functions for life and speed
		public int getLife(){return life;	}
		public int getSpeed(){	return speed;	}
		
		
		//getter and setting methods for air function.
		public boolean inAir(){		return air;		}
		public void startJump(){	air = true;		}
		public void endJump(){		air = false;	}
		
		
		public Fighter(String n, BasicAttack [] a, Ability [] ab, Block b, int s){
			name=n;
			attacks = a;
			abilities = ab;
			block = b;
			
			life=100;	
			speed =s;
			
			//inAir is to tell if a player is jumping in air, to add jumping abilities/fights.
			air=false;
			
			//basic pre-set up x and y positions
			xPos =-99;
			yPos=-99;
		}

}
