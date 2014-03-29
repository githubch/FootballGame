/**
 * Created by twer on 3/28/14.
 */
public class Reporter implements IAnounceObserver {
    public String announceGetScore(Team team) {
        return "Team" + team.getName() + ":Wow!";
    }

    public String announceLoseScore(Team team) {
        return "Team" + team.getName() + ":Ahh!";
    }
}
