import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class SanskarDance extends ListenerAdapter {
    public String prefix = "monke";
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String args[] = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "sanskarpole")) {
            event.getChannel().sendMessage("\uD83E\uDD24").queue();
            event.getChannel().sendMessage("https://s1.webmshare.com/o1jJo.webm").queue();
        }
    }
}
