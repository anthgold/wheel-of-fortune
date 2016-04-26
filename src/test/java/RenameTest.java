import org.junit.*;
import static org.junit.Assert.*;

public class RenameTest {

  @Test // nameOfFunction_testCase_expectedResult()
  public void newRectangle_instantiatesCorrectly() {
    Rectangle testRectangle = new Rectangle(2,4);
    assertEquals(true, testRectangle instanceof Rectangle);
  }

}
