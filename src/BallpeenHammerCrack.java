
public class BallpeenHammerCrack implements Command {
	public BallpeenHammer ballpeenHammer;

	public BallpeenHammerCrack(BallpeenHammer ballpeenHammer)
	{
		this.ballpeenHammer = ballpeenHammer;
	}
	@Override
	public void execute() {
		ballpeenHammer.crack();
	}

}
