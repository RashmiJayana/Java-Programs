public class Sumofdigits
{

     static int Sum(int n)
    {
        int sum=0;
        while(n>0)
        {
         sum=sum+n%10;
         n=n/10;   
        }
        return sum;
    }

    public static void main(String[] args)
    { 
      int count=0;
      for(int i=0;i<10000;i++)
      {
       
        int sum=Sum(i);
      if(sum==9||sum==18||sum==27||sum==36)
      { 
        Sum(sum);
        count++;
        if (i<10)
        System.out.print(" 000"+i);
        else if(i>10 && i<100)
        System.out.print("  00"+i);
        else if(i>100 && i<1000)
        System.out.print("  0"+i);
        else
        System.out.print("  "+i);
      }
    }
    System.out.println();
    System.out.println("The count is:" +count);
}
}