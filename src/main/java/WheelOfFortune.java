public class WheelOfFortune {
  public static String disemvoweler(String userInput) {
    String results = "";

    if (userInput != null) {
      String output = userInput.replaceAll("[aeiou]", "-");
      results = output;
    }
    return results;
  }

}
