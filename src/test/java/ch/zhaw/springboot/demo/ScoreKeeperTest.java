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
}


