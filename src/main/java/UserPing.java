import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class UserPing extends ListenerAdapter {
    public String prefix = "monke";
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "pingaaditya")) {
            event.getChannel().sendMessage("<@547788520710864896>" + "ping xd").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "pinganimish")) {
            event.getChannel().sendMessage("<@338246989651247104>" + "ping xd").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "pingscb")) {
            event.getChannel().sendMessage("<@519128323150839808>" + "ping xd").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "pingsanskar")) {
            event.getChannel().sendMessage("<@733686011930083379>" + "ping xd").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "pingrudransh")) {
            event.getChannel().sendMessage("<@695586125669990411>" + "ping xd").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "pingamar")) {
            event.getChannel().sendMessage("<@313280057672204288>" + "ping xd").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "pingjohny")) {
            event.getChannel().sendMessage("<@724249886668619938>" + "ping xd").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "pingjohnny")) {
            event.getChannel().sendMessage("<@724249886668619938>" + "ping xd").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "pingrose")) {
            event.getChannel().sendMessage("<@734010277414174740>" + "ping xd").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "pingfreeze")) {
            event.getChannel().sendMessage("<@752523968958824529>" + "ping xd").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "pingmedhika")) {
            event.getChannel().sendMessage("<@763402437129535488>" + "ping xd").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "pingtalath")) {
            event.getChannel().sendMessage("<@851650487328440330>" + "ping xd").queue();
        }
    }
}
