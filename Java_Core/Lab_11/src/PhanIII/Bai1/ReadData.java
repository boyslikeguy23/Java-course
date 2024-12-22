package PhanIII.Bai1;

import java.io.*;

public class ReadData {
    public void readDataBufferReader(){
        //List<NhanVien> lstNhanVien = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("dulieu.txt"));
            //FileInputStream file = new FileInputStream("dulieu.txt");
            //ObjectInputStream objIn = new ObjectInputStream(file);
            //lstNhanVien = (List<NhanVien>) objIn.readObject();
            String c;
            while((c=br.readLine())!=null){
                System.out.println(c);
            }
            //objIn.close();
            br.close();
        }catch ( Exception e){
            e.printStackTrace();
        }
//        for(int i=0; i<lstNhanVien.size(); i++){
//            System.out.println(lstNhanVien.get(i).toString());
//        }
    }
    public void readDataInputStream(){
        String filePath = "dulieu.txt";
        try{
            FileInputStream file = new FileInputStream(filePath);
            //ObjectInputStream in = new ObjectInputStream(file);
            int byteData;
            while((byteData=file.read())!=-1){
                System.out.print((char)byteData);
            }
        }catch(Exception e){}
    }
}
