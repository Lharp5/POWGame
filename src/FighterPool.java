
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
		return new Fighter();
	}
	
	private Fighter fighterB(){
		return ner Fighter();
	}
	private Fighter fighterC(){
		return new Fighter();
	}
	private Fighter fighterD(){
		return new Fighter();
	}

}
