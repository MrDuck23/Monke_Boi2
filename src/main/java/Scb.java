import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Scb extends ListenerAdapter {
     public String prefix = "monke";
     public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
         String[] args = event.getMessage().getContentRaw().split(" ");

         if (args[0].equalsIgnoreCase(prefix + "Scb")) {
             event.getChannel().sendMessage("pure beauty").queue();
             event.getChannel().sendMessage("https://ibb.co/Lx5xQcN").queue();
         }
     }
}
