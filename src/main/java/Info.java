import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class Info extends ListenerAdapter {
    public String prefix = "monke";
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "info")) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("\uD83E\uDDA7 Monke Boi ");
            embed.setDescription("prefix is 'monke'");
            embed.addField("Commands", "Hi, Dance, Cry, GoodMorning, GoodNight, Shut , PlayGame,Ping (users name)", false);
            embed.addField("Commands with Users", "Scb, Sanskar,Aaditya,SanskarPole", false);
            embed.setColor(Color.red).setFooter("Bot created by MrAnimish");
            event.getChannel().sendMessage(embed.build()).queue();
            embed.clear();
        }
        if (args[0].equalsIgnoreCase(prefix + "commands")) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("\uD83E\uDDA7 Monke Boi ");
            embed.setDescription("prefix is 'monke'");
            embed.addField("Commands", "Hi, Dance, Cry, GoodMorning, GoodNight, Shut , PlayGame,Ping (users name)", false);
            embed.addField("Commands with Users", "Scb, Sanskar,Aaditya,SanskarPole", false);
            embed.setColor(Color.cyan).setFooter("Bot created by MrAnimish");
            event.getChannel().sendMessage(embed.build()).queue();
            embed.clear();
        }
        if (args[0].equalsIgnoreCase(prefix + "help")) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("\uD83E\uDDA7 Monke Boi ");
            embed.setDescription("prefix is 'monke'");
            embed.addField("Commands", "Hi, Dance, Cry, GoodMorning, GoodNight, Shut , PlayGame,Ping (users name)", false);
            embed.addField("Commands with Users", "Scb, Sanskar,Aaditya,SanskarPole", false);
            embed.setColor(Color.green).setFooter("Bot created by MrAnimish");
            event.getChannel().sendMessage(embed.build()).queue();
            embed.clear();
        }
    }
}
