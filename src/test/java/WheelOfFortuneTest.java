import org.junit.*;
import static org.junit.Assert.*;

public class WheelOfFortuneTest {

  @Test // nameOfFunction_testCase_expectedResult()
  public void disemvoweler_oneConsonant_s() {
    Disemvowel disemvowel = new Disemvowel();
    assertEquals("s", disemvowel.disemvoweler("s"));
  }

}
