
public class Fighter {
	
		//attributes every fighter has.
	
		private String name;
		
		private BasicAttack [] attacks;
		
		private Ability [] abilities;
		private Block block;
		private int life;
		private int speed;
		private boolean air;
		
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
		}
		
		public void attack(int i){
		}

}
