public class Calculator {
    /*
    add
    sub
    mul
    div
     */
    public void add(int a, int b)
    {
        int result = a + b;
        System.out.println(a + "+" + b + "=" + result);
    }
    public int sub(int a, int b)
    {
        int result = a - b;
        return result;
    }
    public void mul(int a, int b){
        int result = a * b;
        System.out.println(a + "*" + b + "=" + result);
    }
    public void div(int a, int b){
        int result = 0;
        if(b==0){
            System.out.println("Division by zero!");
        }else{
            result = a / b;
            System.out.println(a + "/" + b + "=" + result);
        }
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sub(2, 3);
        int a = calculator.sub(2, 3);
        System.out.println(a);
    }
}
