// prg to find the sum of digits
import java.util.Scanner;
class sum1
{
     int num,rem,sum;
     public void cal()
     {
       System.out.println("Enter a number: ");
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       while(num>0)
       {
               rem=num%10;
               sum=sum+rem;
               num=num/10;
       }
              System.out.println("The sum of the number is: "+sum);
       }
       public static void main(String args[])
       {
              sum1 ob=new sum1();
              ob.cal();
       }
}