import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Sanskar extends ListenerAdapter {
  public String prefix = "monke";public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "sanskar")) {
            event.getChannel().sendMessage("heroo").queue();
            event.getChannel().sendMessage("https://ibb.co/0VQNV2X").queue();

      }
   }
}
