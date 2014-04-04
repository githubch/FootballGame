/**
 * Created by twer on 3/28/14.
 */
public class Reporter implements IAnnounceObserver {

    public static final String TEAM = "Team";
    public static final String WOW = ":Wow!";
    public static final String AHH = ":Ahh!";

    public String announceGetScore(Team team) {
        return String.format("%s%s%s", TEAM, team.getName(), WOW);
    }

    public String announceLoseScore(Team team) {
        return String.format("%s%s%s", TEAM, team.getName(), AHH);
    }
}
