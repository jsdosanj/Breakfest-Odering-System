public class Loops
{
   public static void main(String[] args)
   {
      int a=6, b=10, c;
      int y=20;
      for (int i=0; i<7; i+=2)
      {
         c=a+b;
         a++;
         b--;
         y+=20;
      }
      System.out.print("a=" +a+ "b=" +b);
    }
}