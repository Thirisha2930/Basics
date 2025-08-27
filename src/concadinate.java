import java.util.Scanner;

public class concadinate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the num of string:");
        int n=scan.nextInt();
        scan.nextLine();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strs[i] = scan.nextLine();
        }

        String sum = "";
        for (String str : strs) {
            sum += str;
        }

        System.out.println("Concatenated string: " + sum);

    }
}
