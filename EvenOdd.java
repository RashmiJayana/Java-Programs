import java.util.Scanner;

public class EvenOdd {
public static void main(String args[])
{
    int num;
    System.out.println("Enter the number:");
    Scanner s =new Scanner(System.in);
    num=s.nextInt();
    s.close();
    if (num%2==0)
    {
     System.out.println("The Number is even");
    }
     else
     {
        System.out.println("The number is odd");
     }

    }
}
    


