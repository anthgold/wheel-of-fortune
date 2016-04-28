import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/"); // test for title in home.vtl
    assertThat(pageSource()).contains("Wheel of Fortune");
  }

/*  @Test  // nameOfFunction_testCase_expectedResult()
  public void squareTestIsASquare() {
    goTo("http://localhost:4567/");
    // test goes here
    // assertFoo(pageSource()).contains("Your foo is a bar!"); */
  }

}
