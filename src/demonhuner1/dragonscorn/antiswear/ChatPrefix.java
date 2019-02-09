package demonhunter1.dragonscorn.antiswear;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;

public class ChatPrefix {
	
	public String getStaffChatPrefix(Player p) {
		TextComponent chat = new TextComponent("[STAFF-CHAT] ");
		chat.setBold(true);
		chat.setItalic(true);
		chat.setColor(ChatColor.DARK_RED);
		return TextComponent.toLegacyText(chat) + ChatColor.GOLD + p.getName() + ChatColor.WHITE + "> ";
	}
	
	public String getSwearPrefix(Player p) {
		TextComponent chat = new TextComponent("[ANTI-SWEAR] ");
		chat.setBold(true);
		chat.setItalic(true);
		chat.setColor(ChatColor.DARK_RED);
		return TextComponent.toLegacyText(chat) + ChatColor.GOLD + p.getName() + ChatColor.WHITE + "> ";
	}

}
