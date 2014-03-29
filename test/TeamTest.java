import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 3/28/14.
 */
public class TeamTest {
    @org.junit.Test
    public void shouldBeCrazyWhenGetScore() throws Exception {
        Team team = new Team("A");
        team.getScore();
        String blommmmy = team.announce(new Reporter());
        assertEquals("TeamA:Wow!", blommmmy);
    }

    @Test
    public void shouldBeAhhhhWhenLoseScore() throws Exception {
        Team team = new Team("A");
        team.loseScore();
        String Ahhhh = team.announce(new Reporter());
        assertEquals("TeamA:Ahh!", Ahhhh);
    }
}
