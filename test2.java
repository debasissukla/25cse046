import java.util.Scanner;

class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();

        if (n < 2) {
            System.out.println("String must contain at least 2 characters.");
        } else {
            String firstTwo = str.substring(0, 2);
            String result = "";

            for (int i = 0; i < n; i++) {
                result = result + firstTwo;
            }

            System.out.println("Result: " + result);
        }

        sc.close();
    }
}