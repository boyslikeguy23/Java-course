package Self_Studying;

import java.sql.SQLData;
import java.util.Scanner;

public class Lab06_01_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
        System.exit(0);
    }

}
