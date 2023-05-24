package ch.zhaw.springboot.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class ScoreKeeperTest {
  
    private ScoreKeeper scoreKeeper;

    @Test
    public void TestInitialScore() {
        scoreKeeper = new ScoreKeeper();
        assertEquals("000:000", scoreKeeper.getScore());
    }

    @Test
    public void TestScoreTeamA1() {
       scoreKeeper = new ScoreKeeper();
       assertEquals("001:000", scoreKeeper.getScore());
    }

    @Test
    public void TestScoreTeamA2() {
      scoreKeeper = new ScoreKeeper();
      assertEquals("002:000", scoreKeeper.getScore());
    }
    
    @Test
    public void TestScoreTeamA3() {
      scoreKeeper = new ScoreKeeper();
      assertEquals("003:000", scoreKeeper.getScore());
    }


}


