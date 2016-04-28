public class WheelOfFortune {
  public static String disemvoweler(String userInput) {
    String results = "";

    if (userInput != null) { // is userInput puzzle? appears not
      String output = userInput.replaceAll("[aeiou]", "-");
      results = output;
    }
    return results;
  }

}
