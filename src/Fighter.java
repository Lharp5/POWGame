
public class Fighter {
	
		//attributes every fighter has.
	
		private String name;
		private BasicAttack [] attacks;
		private Ability [] abilities;
		private Block block;
		private int life;
		private int speed;
		
		
		public Fighter(String n, BasicAttack [] a, Ability [] ab, Block b, int s){
			name=n;
			attacks = a;
			abilities = ab;
			block = b;
			
			life=100;	
			speed =s;
		}

}
