
public class ClawHammerHit implements Command {

	public ClawHammer claw;
	
	public ClawHammerHit(ClawHammer claw)
	{
		this.claw = claw;
	}
	@Override
	public void execute() {
		claw.hit();
	}

}
