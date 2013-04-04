
public class FighterPool {
	
	Fighter [] fighters;
	
	public FighterPool(){
		fighters = new Fighter[4];
		
		fighters[0] = fighterA();
		fighters[1] = fighterB();
		fighters[2] = fighterC();
		fighters[3] = fighterD();
	}
	
	//NOTE ALL THESE ARE ARBITRARY, no numbers or names are significant yet
	private Fighter fighterA(){
		
		BasicAttack [] attacks = new BasicAttack[3];
		attacks[0] = new BasicAttack("Right Punch", 5, 10, 1, 1);
		attacks[1] = new BasicAttack("Left Punch", 5, 10, 1, 1);
		attacks[2] = new BasicAttack("Kick", 15, 20, 0.5, 2);
		
		Ability [] abilities = new Ability[3];
		abilities[0] = new Ability("Ability 1A", 30, 15, 0, true, false, false);
		abilities[1] = new Ability("Ability 2A", 30, 15, 0.5, false, true, false);
		abilities[2] = new Ability("Ability 3A", 30, 15, 1, false, false, true);
		
		Block block = new Block(2,5);
		
		return new Fighter("FighterA", attacks, abilities, block, 1);
	}
	
	private Fighter fighterB(){
		BasicAttack [] attacks = new BasicAttack[3];
		attacks[0] = new BasicAttack("Right Punch", 5, 10, 1, 1);
		attacks[1] = new BasicAttack("Left Punch", 5, 10, 1, 1);
		attacks[2] = new BasicAttack("Kick", 15, 20, 0.5, 2);
		
		Ability [] abilities = new Ability[3];
		abilities[0] = new Ability("Ability 1B", 30, 15, 0, true, false, false);
		abilities[1] = new Ability("Ability 2B", 30, 15, 0.5, false, true, false);
		abilities[2] = new Ability("Ability 3B", 30, 15, 1, false, false, true);
		
		Block block = new Block(2,5);
		return new Fighter("FighterA", attacks, abilities, block, 1);
	}
	
	private Fighter fighterC(){
		BasicAttack [] attacks = new BasicAttack[3];
		attacks[0] = new BasicAttack("Right Punch", 5, 10, 1, 1);
		attacks[1] = new BasicAttack("Left Punch", 5, 10, 1, 1);
		attacks[2] = new BasicAttack("Kick", 15, 20, 0.5, 2);		
		
		Ability [] abilities = new Ability[3];
		abilities[0] = new Ability("Ability 1C", 30, 15, 0, true, false, false);
		abilities[1] = new Ability("Ability 2C", 30, 15, 0.5, false, true, false);
		abilities[2] = new Ability("Ability 3C", 30, 15, 1, false, false, true);
		
		Block block = new Block(2,5);
		return new Fighter("FighterA", attacks, abilities, block, 1);
	}
	
	private Fighter fighterD(){
		BasicAttack [] attacks = new BasicAttack[3];
		attacks[0] = new BasicAttack("Right Punch", 5, 10, 1, 1);
		attacks[1] = new BasicAttack("Left Punch", 5, 10, 1, 1);
		attacks[2] = new BasicAttack("Kick", 15, 20, 0.5, 2);
		
		Ability [] abilities = new Ability[3];
		abilities[0] = new Ability("Ability 1D", 30, 15, 0, true, false, false);
		abilities[1] = new Ability("Ability 2D", 30, 15, 0.5, false, true, false);
		abilities[2] = new Ability("Ability 3D", 30, 15, 1, false, false, true);
		
		Block block = new Block(2,5);
		return new Fighter("FighterA", attacks, abilities, block, 1);
	}

}
