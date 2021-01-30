import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);

    int num;

    System.out.println("Enter a number to count down or up from: ");

    num = s.nextInt();

    while (num > 0)
    {
      System.out.println(num);
      num--;
    }

    while (num < 0)
    {
      System.out.println(num);
      num++;
    }

    System.out.println("Blast off!");



  }
}