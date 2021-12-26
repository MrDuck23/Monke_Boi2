import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class BotStartup {
    public static void main(String[] args) throws Exception {
        JDABuilder jda;
        jda = JDABuilder.createDefault("ODk0MTU4ODQ4NTUyNzMwNjU1.YVl8Ug.FA1yHKmYWo4JvmR0THU7ZOr_lv8");
        jda.setActivity(Activity.playing("ur mom"));
        jda.setStatus(OnlineStatus.ONLINE);
        jda.addEventListeners(new Shut());
        jda.addEventListeners(new Ping());
        jda.addEventListeners(new Info());
        jda.addEventListeners(new GoodMorning());
        jda.addEventListeners(new GoodNight());
        jda.addEventListeners(new Cry());
        jda.addEventListeners(new PlayGame());
        jda.addEventListeners(new Scb());
        jda.addEventListeners(new Sanskar());
        jda.addEventListeners(new Hi());
        jda.addEventListeners(new Dance());
        jda.addEventListeners(new Aaditya());
        jda.addEventListeners(new Sigma());
        jda.addEventListeners(new NameReactions());
        jda.addEventListeners(new UserPing());
        jda.addEventListeners(new SanskarDance());
        final JDA build = jda.build();

    }
}