package demonhunter1.dragonscorn.antiswear;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public class Utils {
	
	
	public static boolean checkIfStaff(Player p) {
	return p.hasPermission("chatmanager.staff");
	}

	public static List<Player> getAllStaff(){
	List<Player> players = new ArrayList<Player>();
	for(Player p : Main.instance.getServer().getOnlinePlayers()) 
	{
		if(checkIfStaff(p))
			players.add(p);
	}
	return players;
	}

	public static long getSecondsToTicks(long seconds) {
	return 20*seconds;
	}
	

}
