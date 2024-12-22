package BaiThucHanh3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoJp2Saveobject {
    public static void main(String[] args) {
        DemoJp2Saveobject demo = new DemoJp2Saveobject();
        demo.saveNhanVien();
        demo.readNhanVien();
    }
    public void saveNhanVien(){
        List<NhanVien> lstNhanVien = new ArrayList<NhanVien>();

        NhanVien nv1 = new NhanVien("Nguyen Van A", 18, "HN");
        NhanVien nv2 = new NhanVien("Elly Truong", 18, "HCM");
        NhanVien nv3 = new NhanVien("Ngoc Trinh", 18, "DN");
        lstNhanVien.add(nv1);
        lstNhanVien.add(nv2);
        lstNhanVien.add(nv3);
        try{
            //Ghi xuong file
            FileOutputStream file = new FileOutputStream("data.db");
            ObjectOutputStream objOut = new ObjectOutputStream(file);;
            objOut.writeObject(lstNhanVien);
            objOut.flush(); // Tong bo nho dem xuong tep tin
            objOut.close();
        }catch (Exception e){
            Logger.getLogger(DemoJp2Saveobject.class.getName()).log(Level.SEVERE, null, e);

        }



    }
    public void readNhanVien(){
        List<NhanVien> lstNhanVien = new ArrayList<>();
        try{
            FileInputStream file = new FileInputStream("data.db");
            ObjectInputStream objIn = new ObjectInputStream(file);
            lstNhanVien = (List<NhanVien>) objIn.readObject();
            objIn.close();
        }catch ( Exception e){
            e.printStackTrace();
        }
        for(int i=0; i<lstNhanVien.size(); i++){
            System.out.println(lstNhanVien.get(i).toString());
        }
    }
}
