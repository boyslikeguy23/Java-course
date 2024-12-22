import jdk.jshell.spi.SPIResolutionException;

import java.util.Scanner;

public class Book {
    private String bookName;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int numOfPage;
    private float price;

    private void nhapDuLieu(){
        System.out.println("Nhap du lieu cho sach");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten sach: ");
        this.bookName = scanner.nextLine();
        System.out.print("Nhap nha xuat ban sach: ");
        this.author = scanner.nextLine();
        System.out.print("Nhap tac gia: ");
        this.publisher = scanner.nextLine();

    }
}
