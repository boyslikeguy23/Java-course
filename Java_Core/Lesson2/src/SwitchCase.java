import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //initializing
        int month, year, day=0;
        //Enter
        System.out.print("Enter month: ");
        month = sc.nextInt();
        System.out.print("Enter year: ");
        year = sc.nextInt();
        //Tinh so ngay trong thang, nam
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if ((year%4==0 && year%100!=0) || (year%400==0))
                    day = 29;
                else {
                    day = 28;
                }
                break;
            default:
                System.out.println("Nhập sai dữ liệu tháng, năm");
        } // ./end switch case
        //In ra man hinh
        if(day>0)
            System.out.printf("Tháng %d, năm %d có %d ngày!", month, year, day);
    }
}
