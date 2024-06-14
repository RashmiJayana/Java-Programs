import java.util.Scanner;

public class Factorial {

    static int Fact(int n)
    {
        int res=1;
        for(int i=1;i<=n;i++)
        {
            res*=i;
        }
        return res;

    }
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        System.out.println("The Factorial of " +n+ " is:" +Fact(n));

    }
    
}
