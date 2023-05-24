package ch.zhaw.springboot.demo;
import org.junit.jupiter.api.Test;



public class ScoreKeeperTest {
  

   @Test
    public void TestInitialScore() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        assertEquals("000:000", ScoreKeeper.getScore())
   }
}


