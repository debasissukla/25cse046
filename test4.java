import java.util.Scanner;

class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() >= 2) {
            String result = str.substring(1, str.length() - 1);
            System.out.println("Result: " + result);
        } else {
            System.out.println("String is too short.");
        }

        sc.close();
    }
}