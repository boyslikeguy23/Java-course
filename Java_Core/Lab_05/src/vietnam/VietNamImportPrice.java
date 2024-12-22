package vietnam;

import product.Product;

import java.util.Scanner;

public class VietNamImportPrice extends Product {
    private float taxImported; //Thue nhap khau

    public VietNamImportPrice() {
        super();
    }

    public VietNamImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Imported Tax: ");
        this.taxImported = sc.nextFloat();
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Imported Tax: " + this.taxImported);
    }

    @Override
    public float calculateSalePrice() {
        float importedPrice = super.calculateSalePrice();
        float sale_price = importedPrice + (importedPrice * this.taxImported) + 0.1f * (importedPrice + importedPrice * this.taxImported);  // Sale price = Imported price + Tax + 10% profit margin
        return sale_price;
    }

}
