import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Hi extends ListenerAdapter {
    public String prefix = "monke";
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "hi")) {
            event.getMessage().reply("hi ra mowa").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "hello")) {
            event.getMessage().reply("helloooo").queue();
        }
    }
}

