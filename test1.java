import java.util.Scanner;

class test1 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter first string: ");
       String str1 = sc.nextLine();

       System.out.print("Enter second string: ");
       String str2 = sc.nextLine();

       String result = str1 + str2;
	System.out.println("The original string is: " + result);

	String rev = result.toLowerCase();
       System.out.println("The reversed String is: " + rev);

       sc.close();
   }
}