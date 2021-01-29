import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a number to count up or down from: ");
    int num = s.nextInt();

  if (num > 0)
  {
    while (num >= 0){
      System.out.println(num--);
      if (num == 0){
        System.out.println("Blast off!");
      }
  

  }
    
  }
  }


  
      
    }
  }
}