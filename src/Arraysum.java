import java.util.Scanner;
public class Arraysum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);

    }
    }