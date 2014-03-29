import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 3/28/14.
 */
public class FootballGameTest {
    @Test
    public void shouldReportrSpeakWowWhenTeamGetScore() throws Exception {
        Team team = new Team("A");
        FootballGame footballGame = new FootballGame(team, null);
        team.getScore();
        String output = footballGame.announce(new Reporter());
        assertEquals("TeamA:Wow!", output);
    }

    @Test
    public void shouldReporterSpeakAhhWhenTeamLoseScore() throws Exception {
        Team team = new Team("A");
        FootballGame footballGame = new FootballGame(team, null);
        team.loseScore();
        String output = footballGame.announce(new Reporter());
        assertEquals("TeamA:Ahh!", output);
    }

    @Test
    public void shouldScoreBoardSpeakIncreaseWhenTeamGetScore()
    {
        Team team = new Team("A");
        FootballGame footballGame = new FootballGame(team, null);
        team.getScore();
        String output = footballGame.announce(new ScoreBoard());
        assertEquals("TeamA:Increase++", output);
    }

    @Test
    public void shouldScoreBoardSpeakKeepWhenTeamLoseScore() throws Exception {
        Team team = new Team("A");
        FootballGame footballGame = new FootballGame(team, null);
        team.loseScore();
        String output = footballGame.announce(new ScoreBoard());
        assertEquals("TeamA:Keep!!", output);
    }

    @Test
    public void shouldReportTeamAWowAndTeamBAhhWhenTeamAGetScore() throws Exception {
        Team teamA = new Team("A");
        Team teamB = new Team("B");
        FootballGame footballGame = new FootballGame(teamA, teamB);
        teamA.getScore();
        String announce = footballGame.announce(new Reporter());
        assertEquals("TeamA:Wow!,TeamB:Ahh!", announce);
    }
}
