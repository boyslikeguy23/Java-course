package BaiThucHanh05;

public class Lab03_Prac_02 {

    public static boolean find69(int result) {
       if(result == 69){
           return true;
       }
       return false;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            if(find69(i)) {
                System.out.println("\nFound 69 at: " + i);
            }
        }

    }
}
