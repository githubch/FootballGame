import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 3/28/14.
 */
public class TeamTest {
    Team team;
    @Before
    public void setUp() throws Exception {
        team = new Team("A");
    }

    @org.junit.Test
    public void shouldBeCrazyWhenGetScore() throws Exception {
        team.getScore();
        assertEquals("TeamA:Wow!", team.announce(new Reporter()));
    }

    @Test
    public void shouldBeAhhhhWhenLoseScore() throws Exception {
        team.loseScore();
        assertEquals("TeamA:Ahh!", team.announce(new Reporter()));
    }
}
