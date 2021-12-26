import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PlayGame extends ListenerAdapter {
    public String prefix = "monke";
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "playgame")) {
            event.getChannel().sendMessage("https://tenor.com/view/monke-gaming-monkey-rocket-league-funny-gif-21095512").queue();
            event.getChannel().sendMessage("gamering" ).queue();
        }
    }
}
