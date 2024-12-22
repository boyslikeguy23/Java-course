//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class MainClass {
    final float PI = 3.14F;
    public static void main(String[] args) {
        final MainClass objFinal = new MainClass();
        objFinal.display(22.7F);
    }
    public void display(float pi){
        //PI = pi;
        System.out.println("PI = " + PI);
    }
}