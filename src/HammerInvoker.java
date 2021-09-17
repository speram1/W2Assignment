public class HammerInvoker {

	public Command command;

	
	public void command(Command command)
	{
		this.command = command;
	}
	
	public void CommandExecute()
	{
		command.execute();
	}

}
