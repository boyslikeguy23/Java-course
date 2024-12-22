package BTH1_ITinhToan;

public class ImplOperationAdd implements ITinhToan, IAccuracy {
    private int accuracy;
    @Override
    public void doOperation(float num1, float num2){
        System.out.printf("\n");
        System.out.printf("Result ADD = %." + this.accuracy + "f", (num1 + num2));

    }

    @Override
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
