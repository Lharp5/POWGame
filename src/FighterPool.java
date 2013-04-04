
public class FighterPool {
	
	Fighter [] fighters;
	
	public FighterPool(){
		fighters = new Fighter[4];
		
		fighters[0] = fighterA();
		fighters[1] = fighterB();
		fighters[2] = fighterC();
		fighters[3] = fighterD();
	}
	
	private Fighter fighterA(){
		
		BasicAttack [] attacks = new BasicAttack[3];
		attacks[0] = new BasicAttack("Right Punch", 5, 10, 1, 1);
		attacks[1] = new BasicAttack("Left Punch", 5, 10, 1, 1);
		attacks[2] = new BasicAttack("Kick", 15, 20, 0.5, 2);
		
		Ability [] abilities = new Ability[3];
		abilities[0] = new Ability();
		abilities[1] = new Ability();
		abilities[2] = new Ability();
		
		Block block = new Block();
		
		return new Fighter("FighterA", attacks, abilities, block, 1);
	}
	
	private Fighter fighterB(){
		BasicAttack [] attacks = new BasicAttack[3];
		attacks[0] = new BasicAttack("Right Punch", 5, 10, 1, 1);
		attacks[1] = new BasicAttack("Left Punch", 5, 10, 1, 1);
		attacks[2] = new BasicAttack("Kick", 15, 20, 0.5, 2);
		
		Ability [] abilities = new Ability[3];
		abilities[0] = new Ability();
		abilities[1] = new Ability();
		abilities[2] = new Ability();
		
		Block block = new Block();
		return new Fighter("FighterA", attacks, abilities, block, 1);
	}
	
	private Fighter fighterC(){
		BasicAttack [] attacks = new BasicAttack[3];
		attacks[0] = new BasicAttack("Right Punch", 5, 10, 1, 1);
		attacks[1] = new BasicAttack("Left Punch", 5, 10, 1, 1);
		attacks[2] = new BasicAttack("Kick", 15, 20, 0.5, 2);		
		
		Ability [] abilities = new Ability[3];
		abilities[0] = new Ability();
		abilities[1] = new Ability();
		abilities[2] = new Ability();
		
		Block block = new Block();
		return new Fighter("FighterA", attacks, abilities, block, 1);
	}
	
	private Fighter fighterD(){
		BasicAttack [] attacks = new BasicAttack[3];
		attacks[0] = new BasicAttack("Right Punch", 5, 10, 1, 1);
		attacks[1] = new BasicAttack("Left Punch", 5, 10, 1, 1);
		attacks[2] = new BasicAttack("Kick", 15, 20, 0.5, 2);
		
		Ability [] abilities = new Ability[3];
		abilities[0] = new Ability();
		abilities[1] = new Ability();
		abilities[2] = new Ability();
		
		Block block = new Block();
		return new Fighter("FighterA", attacks, abilities, block, 1);
	}

}
