import java.util.Scanner;
class Fact
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter a number=");
      int a=in.nextInt();
      int i;
      int f=1;
      for(i=a;i>=1;i--)
      {
    	 f=f*i;
      }
      System.out.println("Factorial=" +f);
   }
}
