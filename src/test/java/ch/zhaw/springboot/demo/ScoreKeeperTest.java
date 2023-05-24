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
       scoreKeeper.scoreTeamA1();
       assertEquals("001:000", scoreKeeper.getScore());
    }

    @Test
    public void TestScoreTeamA2() {
      scoreKeeper = new ScoreKeeper();
      scoreKeeper.scoreTeamA2();
      assertEquals("002:000", scoreKeeper.getScore());
    }
    
    @Test
    public void TestScoreTeamA3() {
      scoreKeeper = new ScoreKeeper();
      scoreKeeper.scoreTeamA3();
      assertEquals("003:000", scoreKeeper.getScore());
    }

    @Test
    public void TestScoreTeamB1() {
       scoreKeeper = new ScoreKeeper();
       scoreKeeper.scoreTeamB1();
       assertEquals("001:000", scoreKeeper.getScore());
    }

    @Test
    public void TestScoreTeamB2() {
      scoreKeeper = new ScoreKeeper();
      scoreKeeper.scoreTeamB2();
      assertEquals("002:000", scoreKeeper.getScore());
    }
    
    @Test
    public void TestScoreTeamB3() {
      scoreKeeper = new ScoreKeeper();
      scoreKeeper.scoreTeamB3();
      assertEquals("003:000", scoreKeeper.getScore());
    }

}


