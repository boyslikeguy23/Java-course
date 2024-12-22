import java.util.Scanner;

class PhuongTrinhBacHai {
    private double a;
    private double b;
    private double c;

    // Constructor
    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phương thức tính delta
    public double tinhDelta() {
        return b * b - 4 * a * c;
    }

    // Phương thức giải và in nghiệm
    public void giaiPhuongTrinh() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình trở thành phương trình bậc nhất với nghiệm x = " + x);
            }
        } else {
            double delta = tinhDelta();

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm thực.");
            }
        }
    }
}

