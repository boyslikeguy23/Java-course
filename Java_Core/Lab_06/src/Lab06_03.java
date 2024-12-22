import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lab06_03 {
    ArrayList<String> lstMonHoc = new ArrayList<>();

    public void test(){
        lstMonHoc.add("Java");
        lstMonHoc.add("Python");
        lstMonHoc.add("C++");
        lstMonHoc.add("PHP");
        lstMonHoc.add("Android");
        System.out.println("Danh sách môn học chưa sắp xếp: ");
        for(String s : lstMonHoc){
            System.out.println(s);
        }
        Collections.sort(lstMonHoc);
        System.out.println("Danh sách môn học sau khi đã sắp xếp: ");
        for(String s : lstMonHoc){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Lab06_03 lab06_03 = new Lab06_03();
        lab06_03.test();
    }
}
