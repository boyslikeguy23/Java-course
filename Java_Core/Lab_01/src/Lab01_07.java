import java.util.Scanner;

public class Lab01_07 {
    public static void main(String[] args) {
        //Initialize
        int num1, num2, max, min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();

        //tim max, min
        if(num1>num2)
        {
            max=num1;
            min=num2;
        }else
        {
            max=num2;
            min=num1;
        }
        System.out.println("\n Max = "+ max + "\n Min = "+ min);
        max = (num1>num2)?num1:num2;
        min = (num1>num2)?num2:num1;
        System.out.println("\n Max = "+ max + "\n Min = " + min);

    }
}
