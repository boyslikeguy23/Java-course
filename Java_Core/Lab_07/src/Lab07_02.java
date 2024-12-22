import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lab07_02 {
    public static void main(String[] args) {
        Set<String> setcountry = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            setcountry.add(sc.nextLine());
        }
        System.out.println(setcountry);
    }
}
