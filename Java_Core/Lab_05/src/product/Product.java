package product;

import java.util.Scanner;

public class Product {
    private String prodId;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    /**
     * Hàm tạo không đối
     */
    public Product() {
    }

    /**
     *
     * @param prodId Id của sản phẩm
     * @param prodName Tên sản phẩm
     * @param manufacturer Nhà sản xuất
     * @param producerPrice Giá sản phẩm
     */
    public Product(String prodId, String prodName, String manufacturer, float producerPrice)
    {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        this.prodId = sc.nextLine();
        System.out.print("Enter Product Name: ");
        this.prodName = sc.nextLine();
        System.out.print("Enter Manufacturer: ");
        this.manufacturer = sc.nextLine();
        System.out.print("Enter Producer Price: ");
        this.producerPrice = sc.nextFloat();
    }

    public void display(){
        System.out.println("Product ID: " + this.prodId);
        System.out.println("Product Name: " + this.prodName);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Producer Price: " + this.producerPrice);
    }

    public float calculateSalePrice(){
        float sale_price = producerPrice + 0.05f*producerPrice;
        return sale_price;
    }
}
