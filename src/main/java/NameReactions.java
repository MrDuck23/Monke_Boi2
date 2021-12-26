import com.sun.org.apache.xpath.internal.operations.Or;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Locale;

public class NameReactions extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        //name reactions
        if (event.getMessage().getContentRaw().contains("animish")) {
            event.getMessage().addReaction("\uD83E\uDD24").queue();
        }
        if (event.getMessage().getContentRaw().contains("Animish")) {
            event.getMessage().addReaction("\uD83E\uDD24").queue();
        }
        if (event.getMessage().getContentRaw().contains("aaditya")) {
            event.getMessage().addReaction("\uD83E\uDD74").queue();
        }
        if (event.getMessage().getContentRaw().contains("Aaditya")) {
            event.getMessage().addReaction("\uD83E\uDD74").queue();
        }
        if (event.getMessage().getContentRaw().contains("scb")) {
            event.getMessage().addReaction("\uD83D\uDE30").queue();
        }
        if (event.getMessage().getContentRaw().contains("Scb")) {
            event.getMessage().addReaction("\uD83D\uDE30").queue();
        }
        if (event.getMessage().getContentRaw().contains("avaneendra")) {
            event.getMessage().addReaction("\uD83D\uDE0D").queue();
        }
        if (event.getMessage().getContentRaw().contains("Avaneendra")) {
            event.getMessage().addReaction("\uD83D\uDE0D").queue();
        }
        if (event.getMessage().getContentRaw().contains("sanskar")) {
            event.getMessage().addReaction("\uD83C\uDF51").queue();
            event.getMessage().addReaction("\uD83D\uDCA6").queue();
        }
        if (event.getMessage().getContentRaw().contains("Sanskar")) {
            event.getMessage().addReaction("\uD83C\uDF51").queue();
            event.getMessage().addReaction("\uD83D\uDCA6").queue();
        }
        if (event.getMessage().getContentRaw().contains("samuel")) {
            event.getMessage().addReaction("\uD83E\uDD75").queue();
        }
        if (event.getMessage().getContentRaw().contains("Samuel")) {
            event.getMessage().addReaction("\uD83E\uDD75").queue();
        }
        if (event.getMessage().getContentRaw().contains("medhika")) {
            event.getMessage().addReaction("\uD83E\uDDF8").queue();
        }
        if (event.getMessage().getContentRaw().contains("Medhika")) {
            event.getMessage().addReaction("\uD83E\uDDF8").queue();
        }
        if (event.getMessage().getContentRaw().contains("abhinav")) {
            event.getMessage().addReaction("\uD83D\uDE1D").queue();
        }
        if (event.getMessage().getContentRaw().contains("Abhinav")) {
            event.getMessage().addReaction("\uD83D\uDE1D").queue();
        }
        if (event.getMessage().getContentRaw().contains("rose")) {
            event.getMessage().addReaction("\uD83C\uDF39").queue();
            event.getMessage().addReaction("\uD83E\uDD22").queue();
        }
        if (event.getMessage().getContentRaw().contains("Rose")) {
            event.getMessage().addReaction("\uD83C\uDF39").queue();
            event.getMessage().addReaction("\uD83E\uDD22").queue();
        }
        if (event.getMessage().getContentRaw().contains("johny")) {
            event.getMessage().addReaction("\uD83D\uDE0F").queue();
        }
        if (event.getMessage().getContentRaw().contains("Johny")) {
            event.getMessage().addReaction("\uD83D\uDE0F").queue();
        }
        if (event.getMessage().getContentRaw().contains("johnny")) {
            event.getMessage().addReaction("\uD83D\uDE0F").queue();
        }
        if (event.getMessage().getContentRaw().contains("Johnny")) {
            event.getMessage().addReaction("\uD83D\uDE0F").queue();
        }
    }
}
