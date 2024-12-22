import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList(4);
        System.out.println("in");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        list.add(100);
        System.out.println("in");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //khoi tao
    }
}
