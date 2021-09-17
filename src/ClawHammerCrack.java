
public class ClawHammerCrack implements Command {

	public ClawHammer claw;
	
	public ClawHammerCrack( ClawHammer claw)
	{
		this.claw = claw;
	}
	@Override
	public void execute() {
		claw.crack();
	}

}
