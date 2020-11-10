package Week3;

public class MutabilityChaining {
   public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("start");//sb will have start in it
      sb.append("+middle");//sb= "start+middle"

      //This is a new String with the result from sb
      StringBuilder same = sb.append("+end");
      //no new pool in memory has been created
      //sb = "start+middle+end"

      //StringBuilder same = new StringBuilder(sb.append("+end"));
      // will create an expected result of having the sb & same to be different

      //This will cause object binding, it will print it off for both
      sb.append("|");
      same.append("<-");

      System.out.println(sb);
      System.out.println(same);

      Integer int1 = new Integer(1);
      Integer int2 = int1;
      int2 = 5;

      System.out.println(int1);
      System.out.println(int2);
      System.out.println(int1 == int2);

   }
}