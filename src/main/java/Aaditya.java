import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Aaditya extends ListenerAdapter {
    public String prefix = "monke";
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "Aaditya")) {
            event.getChannel().sendMessage("cute boy").queue();
            event.getChannel().sendMessage("https://ibb.co/qJNthVT").queue();
        }
    }
}
