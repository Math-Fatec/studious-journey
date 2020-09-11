package controller;

import java.util.HashMap;
import java.util.Map;

public final class Active_process {

	private static final Map<String, NameCommand> NAME_COMMANDS;
	private static final Map<String, PIDCommand> PID_COMMANDS;

	static {
		NAME_COMMANDS = new HashMap<>();
		PID_COMMANDS = new HashMap<>();

		String sistema = "windows";
		NAME_COMMANDS.put(sistema, new WindowsNameCommand());
		PID_COMMANDS.put(sistema, new WindowsPIDCommand());

		sistema = "linux";
		NAME.put(sistema, new LinuxNameCommand());
		PID.put(sistema, new LinuxPIDCommand());
		
	}

	public void Name(String sistema) {
		NameCommand command = NAME_COMMANDS.get(sistema);
		String name = command.name();
		System.out.println("NAME:   " + anem);
	}

	public void PID(String sistema) {
		PIDCommand command = PID_COMMANDS.get(sistema);
		int pid = command.pid();
		System.out.println("PID: " + pid);
	}
	
	
}