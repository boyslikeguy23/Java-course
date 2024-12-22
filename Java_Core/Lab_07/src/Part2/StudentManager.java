package Part2;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<String> lstSinhVien = new ArrayList<String>();
    //main
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.testList();
        sm.updateList();
        sm.deleteList();
    }

    //input list
    public void testList(){
        lstSinhVien.clear();
        lstSinhVien.add("Tuấn");
        lstSinhVien.add("Hà");
        lstSinhVien.add("Linh");
        System.out.println("ArrayList Student");
        System.out.println("\t" + lstSinhVien + "\n");
    }

    //delete
    public void deleteList(){
        lstSinhVien.remove(0);
        System.out.println("Delete ArrayList Student");
        System.out.println("\t" + lstSinhVien + "\n");
    }

    //update
    public void updateList(){
        lstSinhVien.set(1, "Hồng Hà");
        System.out.println("Update ArrayList Student");
        System.out.println("\t" + lstSinhVien + "\n");
    }
}
