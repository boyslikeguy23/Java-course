package BaiThucHanh2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoJP2SaveText {
    public DemoJP2SaveText(){

    }
    public static void main(String[] args) {
        try{
            DemoJP2SaveText demoJP2SaveText = new DemoJP2SaveText();

            // Du lieu ao
            List<NhanVien> lstNhanVien = new ArrayList<>();
            NhanVien nv1 = new NhanVien("Nguyen Van A", 18, "HN");
            NhanVien nv2 = new NhanVien("Elly Truong", 18, "HCM");
            NhanVien nv3 = new NhanVien("Ngoc Trinh", 18, "DN");
            lstNhanVien.add(nv1);
            lstNhanVien.add(nv2);
            lstNhanVien.add(nv3);
            demoJP2SaveText.writeTextByLine(lstNhanVien);
            demoJP2SaveText.readTextByLine();
            demoJP2SaveText.writeText2File(lstNhanVien);
            System.out.println("Ghi du lieu thanh cong");
        }catch (IOException e){
            System.out.println("Loi: " + e.getMessage());
            Logger.getLogger(DemoJP2SaveText.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    //Ham ghi du lieu ra file text
    public void writeText2File(List<NhanVien> lstData) throws IOException {
        String filePath = "writeText2File.txt"; // khai bao file
        boolean isVietTiep = false;
        File myFile = new File(filePath);
        FileOutputStream fos = new FileOutputStream(myFile, isVietTiep);
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        //Ghi ra file
        for(NhanVien nhanVien : lstData){
            osw.write(nhanVien.toString());
        }
        osw.flush(); // Push data from temporary memory to file
        osw.close(); // Close connection to file
    }

    /**
     * Su dung BufferedWriter de ghi du lieu ra file
     * @param lstData Danh sach mang du lieu NhanVien
     * @throws
     * @throws
     */
    public void writeTextByLine(List<NhanVien> lstData) throws FileNotFoundException, IOException {
        String filePath = "writeTextByLine.txt";
        boolean isVietTiep = true;
        File myFile = new File(filePath);
        FileOutputStream fos = new FileOutputStream(myFile, isVietTiep);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        //Ghi ra file
        for(NhanVien nhanVien : lstData){
            bw.write(nhanVien.toString());
            bw.newLine(); // them dong moi goi
        }
        bw.flush(); // Tong du lieu tu bo nho tam xuong file
        bw.close(); // Dong ket noi toi file
    }

    public void readTextByLine() throws FileNotFoundException, IOException{
        String filePath = "readTextByLine.txt";
        File myFile = new File(filePath);
        FileInputStream fos = new FileInputStream(myFile);
        BufferedReader br = new BufferedReader(new InputStreamReader(fos));
        String temp;
        int cnt = 1;
        while((temp = br.readLine()) != null){
            System.out.println(cnt + ".\t" + temp);
            cnt++;
        }
    }
}
