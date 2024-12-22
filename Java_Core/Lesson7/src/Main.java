//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Integer[] inArr = {12, 22, 21, 44};
        Float[] ftArr = {1.2f, 2.2f, 3.4f};
        String[] strArr = {"Hung", "Duong", "Sang"};
        Character[] chArr = {'H', 'D', 'S'};
        printArray(inArr);
        System.out.println("=============");
        printArray(ftArr);
        System.out.println("=============");
        printArray(strArr);
        System.out.println("=============");
        printArray(chArr);


    }
    public static <T> void printArray(T[] inputArray){
        System.out.println("Danh sách");
        for(int i = 0; i < inputArray.length; i++){
            System.out.println(inputArray[i]);
        }
    }
}