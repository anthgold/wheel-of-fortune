import org.junit.*;
import static org.junit.Assert.*;

public class WheelOfFortuneTest {

  @Test // nameOfFunction_testCase_expectedResult()
  public void disemvoweler_oneConsonant_n() {
    WheelOfFortune disemvowel = new WheelOfFortune();
    assertEquals("t", disemvowel.disemvoweler("t"));
  }

  @Test
  public void disemvoweler_oneVowel_dash() {
    WheelOfFortune disemvowel = new WheelOfFortune();
    assertEquals("-", disemvowel.disemvoweler("a"));
  }

  @Test
  public void disemvoweler_oneWord_cDashT() {
    WheelOfFortune disemvowel = new WheelOfFortune();
    assertEquals("c-t", disemvowel.disemvoweler("cat"));
  }

  @Test 
  public void disemvoweler_twoWords_bLDashCK_cDashT() {
    WheelOfFortune disemvowel = new WheelOfFortune();
    assertEquals("bl-ck c-t", disemvowel.disemvoweler("black cat"));
  }

}
