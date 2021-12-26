import com.sun.org.apache.xpath.internal.operations.Or;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Sigma extends ListenerAdapter {
    public String prefix = "monke";
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "sigma")) {
            event.getChannel().sendMessage("https://tenor.com/view/skander-sigma-sigma-male-gif-22146858" ).queue();
        }
    }
}
