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
       assertEquals("000:001", scoreKeeper.getScore());
    }

    @Test
    public void TestScoreTeamB2() {
      scoreKeeper = new ScoreKeeper();
      scoreKeeper.scoreTeamB2();
      assertEquals("000:002", scoreKeeper.getScore());
    }
    
    @Test
    public void TestScoreTeamB3() {
      scoreKeeper = new ScoreKeeper();
      scoreKeeper.scoreTeamB3();
      assertEquals("000:003", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamAMultiple() {
        scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();
        assertEquals("012:000", scoreKeeper.getScore());
    }
    @Test
    public void testScoreTeamBMultiple() {
        scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();
        assertEquals("000:012", scoreKeeper.getScore());
    }



}


