import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map model = new HashMap();
      WheelOfFortune myDisemvowel = new WheelOfFortune();

      String userInput = request.queryParams("puzzle");
      String changedString = myDisemvowel.disemvoweler(userInput);

      model.put("output", changedString);
      model.put("template", "templates/results.vtl");

      return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

  }

}
