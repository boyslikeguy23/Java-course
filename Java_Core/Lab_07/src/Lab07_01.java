import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab07_01 {
    public static void main(String[] args) {
        List<Integer> lstInt = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            lstInt.add(sc.nextInt());
        }
        System.out.println("The array is: " + lstInt);
        Collections.sort(lstInt);
        System.out.println("The sorted array is: " + lstInt);
    }
}
