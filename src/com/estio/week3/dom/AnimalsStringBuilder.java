package Week3;

public class AnimalsStringBuilder {
   public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("animals");
      String sub = sb.substring(0, sb.indexOf("al"));
      int len = sb.length();
      char ch = sb.charAt(6);
      System.out.println(sub + " " + len + " " + ch);
   }
}