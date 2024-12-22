package Part2;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> studentDEV = new HashMap<>();
        studentDEV.put("K1230", "Tuan");
        studentDEV.put("K1231", "Nam");
        studentDEV.put("K1232", "Thao");
        studentDEV.put("K1233", "Binh");
        studentDEV.put("K1234", "Hoang");
        for (Map.Entry<String, String> entrySet : studentDEV.entrySet()) {
            String key = entrySet.getKey();
            String value = entrySet.getValue();
            System.out.println(key + " = " + value);
        }

        System.out.println("Student rollno = K1231 is " + studentDEV.get("K1231"));
    }
}
