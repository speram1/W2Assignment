
public class HammerTestClass {
    public static void main(String[] args) {

	BallpeenHammer bp = new BallpeenHammer();
	ClawHammer cp = new ClawHammer();
	HammerInvoker hi = new HammerInvoker();
	
	BallHammerHit hit = new BallHammerHit(bp);
	hi.command(hit);
	hi.CommandExecute();
	
	BallpeenHammerCrack crack = new BallpeenHammerCrack(bp);
	hi.command(crack);
	hi.CommandExecute();
	
	
	ClawHammerHit clawhit = new ClawHammerHit(cp);
	hi.command(clawhit);
	hi.CommandExecute();
	
	ClawHammerCrack clawcrack = new ClawHammerCrack(cp);
	hi.command(clawcrack);
	hi.CommandExecute();
	
}
}