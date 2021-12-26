import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GoodMorning extends ListenerAdapter {
    public String prefix = "monke";
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "goodmorning")) {
            event.getMessage().reply("goodmorning vro").queue();
            event.getChannel().sendMessage("https://tenor.com/view/good-morning-monke-gm-epics-good-morning-monkey-monkeys-good-morning-gif-21792845" ).queue();
        }
    }
}
