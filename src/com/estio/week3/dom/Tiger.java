package Week3;

public class Tiger {
   String name;
   public static void main(String[] args) {

      Tiger t1 = new Tiger();
      Tiger t2 = new Tiger();
      Tiger t3 = t1;
      System.out.println(t1 == t3);
      System.out.println(t1 == t2);
      System.out.println(t1.equals(t2));
   }
}

//Answer  - true , false, false
//While lines 10 & 11 are testing the references for t1, t2, & t3,
//line 12 gives false because there is no implementation for the method equals()