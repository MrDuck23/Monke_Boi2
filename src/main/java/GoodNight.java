import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GoodNight extends ListenerAdapter {
    public String prefix = "monke";
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "goodnight")) {
            event.getMessage().reply("goodnight happy ga paduko vro").queue();
            event.getChannel().sendMessage("https://tenor.com/view/monkey-wake-wake-up-sleepy-tired-gif-12530036" ).queue();
        } 
    }
}
