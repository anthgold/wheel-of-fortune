public class WheelOfFortune {
  public static void main(String[] args) { } // this will move to App.java

  public static String disemvoweler(String userInput) {
    String results = "";

    if (userInput != null) {
      String output = userInput.replaceAll("[aeiou]", "-");
      results = output;
    }
    return results;
  }

}
