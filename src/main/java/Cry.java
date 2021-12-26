import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Cry extends ListenerAdapter {
    public String prefix = "monke";
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "Cry")) {
            event.getChannel().sendMessage("you rn xd").queue();
            event.getChannel().sendMessage("https://tenor.com/view/sad-gibbon-sad-gibbon-monkey-sad-monkey-gif-19435323" ).queue();
        }
    }
}
