import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        int n=num;
        int rev=0;
        while (num !=0) {
        int d=num%10;
        rev =rev*10+d;
        num = num/10;
        }
        if(rev ==n )
        {
          System.out.println(n +" is palindrom number.");
        }
        else{
            System.out.println(n +" is not palindrom number.");

        }
    }
}
