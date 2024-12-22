import java.io.File;

public class DevFileDemo {
    public static void main(String[] args) {
        File file = new File("E:\\Studying\\Java_Springboot_Project\\Hello.txt");
        System.out.println("Path: " + file.getPath());
        System.out.println("Name: " + file.getName());
        System.out.println("File exist?: " + file.exists());
        System.out.println("File is directory?: " + file.isDirectory());
        System.out.println("File is file?: " + file.isFile());
        System.out.println("Size: " + file.length());
    }
}
