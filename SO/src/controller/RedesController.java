package controller;

import java.util.HashMap;
import java.util.Map;

public final class RedesController {

	private static final Map<String, IpCommand>   IP_COMMANDS;
	private static final Map<String, PingCommand> PING_COMMANDS;

	static {
		IP_COMMANDS   = new HashMap<>();
		PING_COMMANDS = new HashMap<>();

		String sistema = "windows";
		IP_COMMANDS.put(sistema,   new WindowsIpCommand());
		PING_COMMANDS.put(sistema, new WindowsPingCommand());

		sistema = "linux";
		IP_COMMANDS.put(sistema,   new LinuxIpCommand());
		PING_COMMANDS.put(sistema, new LinuxPingCommand());
	}

	public void ip(String sistema) {
		IpCommand command = IP_COMMANDS.get(sistema);
		String ip = command.ip();
		System.out.println("IP:   " + ip);
	}

	public void ping(String sistema) {
		PingCommand command = PING_COMMANDS.get(sistema);
		int ping = command.ping();
		System.out.println("PING: " + ping);
	}
}