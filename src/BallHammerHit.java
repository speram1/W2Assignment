
public class BallHammerHit implements Command {
	public BallpeenHammer ballpeenHammer;

	public BallHammerHit(BallpeenHammer ballpeenHammer)
	{
		this.ballpeenHammer = ballpeenHammer;
	}
	@Override
	public void execute() {
		ballpeenHammer.hit();
	}

}
