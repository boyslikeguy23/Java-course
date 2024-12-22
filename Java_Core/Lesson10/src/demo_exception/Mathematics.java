package demo_exception;

public class Mathematics {
    //phep chia
    public void divide(int num1, int num2) {
//        int res = num1 / num2;
//        System.out.println(res);
        int res = 0;
        try{
            res = num1 / num2;
            System.out.println(res);
        }catch(Exception e){
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
            System.out.println("Loi chia cho 0!");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        mathematics.divide(4, 5);
        int x = 2;
        do{
            mathematics.divide(4, x);
            x--;
        }while(true);
    }
}
