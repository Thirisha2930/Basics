import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your age:");
        int x=scan.nextInt();
        if(x>=18)
            {
                System.out.println(x+ " , you are eligible to vote");
            } else{
                System.out.println(x+ ",you are not eligible to vote");
            }


    }
}
