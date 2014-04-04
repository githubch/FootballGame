/**
 * Created by twer on 3/28/14.
 */
public class FootballGame {
    public static final String EMPTY_OUTPUT = "";
    private Team teamA;
    private Team teamB;

    public FootballGame(Team teamA, Team teamB) {

        this.teamA = teamA;
        this.teamB = teamB;
    }

    public String announce(IAnnounceObserver reporter) {
        String output = getAnnouncement(reporter, EMPTY_OUTPUT, teamA);
        output = getAnnouncement(reporter, output, teamB);
        return output;
    }

    private String getAnnouncement(IAnnounceObserver reporter, String output, Team team) {
        if(team != null)
        {
            output += team.announce(reporter);
        }
        return output;
    }
}
