/**
 * Created by twer on 3/29/14.
 */
public class ScoreBoard implements IAnnounceObserver {
    @Override
    public String announceGetScore(Team team) {
        return "Team" + team.getName() + ":Increase++";
    }

    @Override
    public String announceLoseScore(Team team) {
        return "Team" + team.getName() + ":Keep!!";
    }
}
