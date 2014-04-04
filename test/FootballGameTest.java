import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 3/28/14.
 */
public class FootballGameTest {

    private Reporter reporter;
    private ScoreBoard scoreBoarder;
    private Team teamA;

    @Before
    public void setUp() throws Exception {
        teamA = new Team("A");
        reporter = new Reporter();
        scoreBoarder = new ScoreBoard();
    }

    @Test
    public void shouldReporterSpeakWowWhenTeamGetScore() throws Exception {
        teamA.getScore();
        String announce = footBallGameAnnounce(teamA, null, reporter);
        assertEquals("TeamA:Wow!", announce);
    }

    @Test
    public void shouldReporterSpeakAhhWhenTeamLoseScore() throws Exception {
        teamA.loseScore();
        String announce = footBallGameAnnounce(teamA, null, reporter);
        assertEquals("TeamA:Ahh!", announce);
    }

    @Test
    public void shouldScoreBoardSpeakIncreaseWhenTeamGetScore()
    {
        teamA.getScore();
        String announce = footBallGameAnnounce(teamA, null, scoreBoarder);
        assertEquals("TeamA:Increase++", announce);
    }

    @Test
    public void shouldScoreBoardSpeakKeepWhenTeamLoseScore() throws Exception {
        teamA.loseScore();
        String announce = footBallGameAnnounce(teamA, null, scoreBoarder);
        assertEquals("TeamA:Keep!!", announce);
    }


    @Test
    public void shouldReportTeamAWowAndTeamBAhhWhenTeamAGetScore() throws Exception {
        teamA.getScore();
        String announce = footBallGameAnnounce(teamA, new Team("B"), reporter);
        assertEquals("TeamA:Wow!TeamB:Ahh!", announce);
    }

    private String footBallGameAnnounce(Team teamA, Team TeamB, IAnnounceObserver announcer) {
        FootballGame footballGame = new FootballGame(teamA, TeamB);
        return footballGame.announce(announcer);
    }
}
