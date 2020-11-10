package Week3;

public class DeleteBasics {
   public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("abcdef");
      sb.delete(1, 3);   // sb = adef
      //This will throw an exception error because
      //it will be out of bounds
      sb.deleteCharAt(5);
   }
}