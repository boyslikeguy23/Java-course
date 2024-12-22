import java.util.Scanner;

public class Lab03_07 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        while(n<=0)
        {
            System.out.println("The number can not be non-positive, must re-enter: ");
            n = sc.nextInt();
        }
        for (int i = 1; i<n; i++)
        {
           // if(i%2!=0)
                System.out.println(i%2!=0?i:"");

        }
    }
}
