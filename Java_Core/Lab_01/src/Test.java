import java.util.Scanner;

public class PhuongTrinhB1{
	int a, b, c;

	public PhuongTrinhB1(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public PhuongTrinhB1(){}
	
	public void nhapDuLieu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert parameters for Linear equation ax + b = c");
		System.out.println("Insert parameters a");
		a = sc.nextInt();
		System.out.println("Insert parameters b");
		b = sc.nextInt();
		System.out.println("Insert parameters c");
		c = sc.nextInt();
	}
	
	public void solveEquation(){
		double res;
		if(a==0){
			if(b==c){
				System.out.println("There are infinitely many solutions to this equation");
			}
			else{
				System.out.println("There are no solutions to this equation");
			}
		}else{
			res= (double)(c-b)/a;
				System.out.printf("The solutions of this equation is %.2f\n", res);
			}
		}
	
	public static void main(String args[]){
		PhuongTrinhB1 phuongTrinh = new PhuongTrinhB1();
		phuongTrinh.nhapDuLieu();
		phuongTrinh.solveEquation();
	}
}