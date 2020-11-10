package Week3;

public class Appendbasics {
   public static void main(String[] args) {
      StringBuilder sb = new StringBuilder().append(1).append('c');
      sb.append("-").append(true);
      System.out.println(sb); // 1c-true

   }
}