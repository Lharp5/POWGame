
public class BasicAttack {
	
	private String type;
	private int damage;
	private int range;
	private double actionsPS;
	private double actionDuration;
	
	public BasicAttack(String t, int d, int r, double a, double ad){
		
		//name of attack
		type=t;
		
		//damage it does
		damage =d;
		
		//range it has
		range =r;
		
		//dps
		actionsPS =a;
		
		//cast time might be removed???
		actionDuration =d;
	}

}
