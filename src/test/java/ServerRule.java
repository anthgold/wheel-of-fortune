import org.junit.rules.ExternalResource;
import spark.Spark;

public class ServerRule extends ExternalResource {

  protected void before() {
    String[] args = {};
    App.main(args); // if the main app class has a different name, /\ App
  }

  protected void after() {
    Spark.stop();
  }
}
