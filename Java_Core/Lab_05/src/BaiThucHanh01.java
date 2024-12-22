import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BaiThucHanh01 {
    public static void main(String[] args) {
        System.out.println("Nhập nhiệt độ cần chuyển đổi: ");
        Scanner sc = new Scanner(System.in);
        float nhietDo = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhiệt độ bạn vừa nhập là: (bấm C hoặc F)");
        char type = sc.next().charAt(0);
        ConvertTemperature convert = new ConvertTemperature();
        switch (type) {
            case 'C':
                convert.convert(nhietDo, true);
                break;
            case 'F':
                convert.convert(nhietDo, false);
                break;
        }
    }
}