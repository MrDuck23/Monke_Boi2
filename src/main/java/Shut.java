import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Shut extends ListenerAdapter {
    public String prefix = "monke";

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase(prefix + "shut")) {
            event.getChannel().sendMessage("Mention the persons name too!").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutanimish")) {
            event.getChannel().sendMessage("shut up <@338246989651247104>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutscb")) {
            event.getChannel().sendMessage("shut up <@519128323150839808>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutchatrapathi")) {
            event.getChannel().sendMessage("shut up <@519128323150839808>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutfreeze")) {
            event.getChannel().sendMessage("shut up <@752523968958824529>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutdhanvi")) {
            event.getChannel().sendMessage("shut up <@752523968958824529>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutproximity")) {
            event.getChannel().sendMessage("shut up <@603520720680779798>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutaaditya")) {
            event.getChannel().sendMessage("shut up <@547788520710864896>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutamar")) {
            event.getChannel().sendMessage("shut up <@313280057672204288>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutmedhika")) {
            event.getChannel().sendMessage("shut up <@763402437129535488>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutmiruko")) {
            event.getChannel().sendMessage("shut up <@792702048533479434>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutansuman")) {
            event.getChannel().sendMessage("shut up <@735716725420589088>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutrose")) {
            event.getChannel().sendMessage("shut up <@734010277414174740>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutsanskar")) {
            event.getChannel().sendMessage("shut up <@733686011930083379>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutharshini")) {
            event.getChannel().sendMessage("shut up <@784689471957893200>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutsigmadick")) {
            event.getChannel().sendMessage("shut up <@695586125669990411>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutjohnny")) {
            event.getChannel().sendMessage("shut up <@724249886668619938>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutavaneendra")) {
            event.getChannel().sendMessage("shut up <@757476863739166730>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutabhinav")) {
            event.getChannel().sendMessage("shut up <@796632464046686228>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutpranay")) {
            event.getChannel().sendMessage("shut up <@829238873640140810>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutsamuel")) {
            event.getChannel().sendMessage("shut up <@745490567068385292>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutjuice")) {
            event.getChannel().sendMessage("shut up <@490032522693181460>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shuttejesh")) {
            event.getChannel().sendMessage("shut up <@852859504050700299>").queue();
        }
        if (args[0].equalsIgnoreCase(prefix + "shutmaanvi")) {
            event.getChannel().sendMessage("shut up <@732470042704478208>").queue();
        }
    }
}