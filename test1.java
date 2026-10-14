import java.util.Scanner;
class test1
{
public static void main(String args[])
	{
	int mark1,mark2,mark3;
	String dob,name;
	float avarage;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name: ");
	name=sc.nextLine();
	System.out.println("enter your date of birth[dd/mm/yyyy]: ");
	dob=sc.nextLine();
	System.out.println("enter your mark1,mark2,mark3 ");
	mark1=sc.nextInt();
	mark2=sc.nextInt();
	mark3=sc.nextInt();
	avarage=(float)(mark1+mark2+mark3)/3;
	System.out.println(name+" "+dob+" "+avarage);
	}
}
     