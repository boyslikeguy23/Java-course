public class findMonth {

    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhập tháng (1-12): ");
        int month = sc.nextInt();
        int validMonth = findMonth(month);
        if (validMonth != -1) {
            printMonth(validMonth);
        }
    }
    public static int findMonth(int month) {
        try {
            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("Tháng phải nằm trong khoảng từ 1 đến 12.");
            }
            return month;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return -1; // Trả về -1 nếu tháng không hợp lệ
        }
    }
    public static void printMonth(int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Tháng " + month + " có 31 ngày.");
        }else if(month == 2) {
            int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
            if((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0)) {
                System.out.println("Tháng " + month + " có 29 ngày (năm nhuận).");
            } else {
                System.out.println("Tháng " + month + " có 28 ngày.");
            }
        }
         else if(month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Tháng " + month + " có 30 ngày.");
        }
    }
    public static void main(String[] args) {
        findMonth fm = new findMonth();
        fm.input();
    }
}
