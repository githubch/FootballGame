/**
 * Created by twer on 3/28/14.
 */
public class Team {
    boolean moreScore = false;
    private String name;

    public Team(String name) {

        this.name = name;
    }

    public void getScore() {
        moreScore = true;
    }

    public void loseScore() {
        moreScore = false;
    }

    public String announce(IAnounceObserver reporter) {
        if(moreScore == true)
            return reporter.announceGetScore(this);
        return reporter.announceLoseScore(this);
    }

    public String getName() {
        return name;
    }
}
