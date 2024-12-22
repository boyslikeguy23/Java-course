package thailand;

import product.Product;

import java.util.Scanner;

public class ThaiLandImportPrice extends Product {
    private float taxImported; //Thue nhap khau
    private float importPriceSupport;

    public ThaiLandImportPrice() {
        super();
    }

    public ThaiLandImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported, float importPriceSupport) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public float getImportPriceSupport() {
        return importPriceSupport;
    }

    public void setImportPriceSupport(float importPriceSupport) {
        this.importPriceSupport = importPriceSupport;
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
        System.out.print("Enter Imported Tax for Thailand: ");
        this.taxImported = sc.nextFloat();
        System.out.print("Enter Imported Price Support for Thailand: ");
        this.importPriceSupport = sc.nextFloat();
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Imported Tax for Thailand: " + this.taxImported);
        System.out.println("Imported Price Support for Thailand: " + this.importPriceSupport);

    }

    @Override
    public float calculateSalePrice() {
        float importedPrice = super.calculateSalePrice();
        float sale_price = importedPrice + (importedPrice * this.taxImported) - importPriceSupport*importedPrice + 0.1f * (importedPrice + importedPrice * this.taxImported - importPriceSupport * importedPrice);  // Sale price = Imported price + Tax + 10% profit margin
        return sale_price;
    }

}
