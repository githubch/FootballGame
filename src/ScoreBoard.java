/**
 * Created by twer on 3/29/14.
 */
public class ScoreBoard implements IAnnounceObserver {

    public static final String TEAM = "Team";
    public static final String INCREASE = ":Increase++";
    public static final String KEEP = ":Keep!!";

    @Override
    public String announceGetScore(Team team) {
        return String.format("%s%s%s", TEAM, team.getName(), INCREASE);
    }

    @Override
    public String announceLoseScore(Team team) {
        return String.format("%s%s%s", TEAM, team.getName(), KEEP);
    }
}
