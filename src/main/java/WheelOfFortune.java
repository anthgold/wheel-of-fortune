public class WheelOfFortune {
  public static String disemvoweler(String userInput) {
    String results = "";

    if (userInput != null) { // is it better to name puzzle userInput?

      String output = userInput.replaceAll("[aeiou]", "-");
      results = output;
    }
    return results;
  }

}
