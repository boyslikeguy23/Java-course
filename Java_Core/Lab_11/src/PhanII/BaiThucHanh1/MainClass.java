package PhanII.BaiThucHanh1;

import java.io.Console;

public class MainClass {
    public static void main(String[] args) {
        Console console = System.console();
        if(console == null) {
            System.err.println("He thống của bạn không ho tro thiet bi Console!");

        }else {
            try{
                String username = console.readLine("Nhap Username: ");
                char[] password = console.readPassword("Nhap Password: ");
                System.out.println(username + " " + new String(password));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
