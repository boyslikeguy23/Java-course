//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyGenerics<String> stringGenerics = new MyGenerics<String>();
        MyGenerics<Integer> integerMyGenerics = new MyGenerics<Integer>();
        stringGenerics.setT(new String("Tôi yêu Việt Nam!"));
        integerMyGenerics.setT(2015);

        System.out.println("Giá trị tại stringGenerics = " + stringGenerics.getT());
        System.out.println("Giá trị tại integerGenerics = " + integerMyGenerics.getT());

        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray = ");
        printArray(integerArray);
        System.out.println("Array doubleArray = ");
        printArray(doubleArray);
        System.out.println("Array charArray = ");
        printArray(charArray);

        AdvancedComparison<Integer> compInt = new AdvancedComparison<>();
        AdvancedComparison<Float> compFLoat = new AdvancedComparison<>();
        AdvancedComparison<String> compString = new AdvancedComparison<>();

        compInt.maximum(9, 3, 6);
        compFLoat.maximum(8.5f, 9.7f, 2.6f);
        compString.maximum("Việt Nam", "Trung Quốc", "Nga");
    }

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
        System.out.println();
    }
}