import org.junit.*;
import static org.junit.Assert.*;

public class WheelOfFortuneTest {

  @Test // nameOfFunction_testCase_expectedResult()
  public void disemvoweler_oneConsonant_n() {
    WheelOfFortune disemvowel = new WheelOfFortune();
    assertEquals("n", disemvowel.disemvoweler("n"));
  }

}
