package BaiThucHanh1;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
       Main main = new Main();
       main.createFolder("Devmaster/slide");
       main.createFile("Devmaster/slide/hocsinh.db");
    }
    void createFolder(String path) {
        File folder = new File(path);
        if(folder.exists()) {
            System.out.println("Folder already exists");
            if(folder.isDirectory()) {
                System.out.println("Folder is a directory");
            }
        }
        else {
            folder.mkdirs();
            System.out.println("Folder doesn't exist, Folder created");
        }
    }
    void createFile(String path) {
        File file = new File(path);
        if(file.exists()) {
            System.out.println("File already exists");
        }else{
            try {
                //Khong ton tai thi tao moi
                file.createNewFile();
            }catch(IOException e) {
                System.out.println("Error creating file: " + e.toString());
            }
            System.out.println("File doesn't exist! File is created");
        }
    }
}