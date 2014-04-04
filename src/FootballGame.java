/**
 * Created by twer on 3/28/14.
 */
public class FootballGame {
    private Team[] teams;
    private Team teamA;
    private Team teamB;

    public FootballGame(Team teamA, Team teamB) {

        this.teamA = teamA;
        this.teamB = teamB;
    }

    public String announce(IAnnounceObserver reporter) {
        String output = "";
        if(teamA != null)
        {
            output += teamA.announce(reporter);
        }
        if(teamB != null)
        {
            output += "," + teamB.announce(reporter);
        }
        return output;
    }
}
