package pkginterface;

public class TwoWheeler implements IVehicle, IManufacturer{
    String ID;
    String type;

    /**
     * Hàm khởi tạo giá trị
     * @param ID ID của phương tiện
     * @param type Loại phương tiện
     */
    public TwoWheeler(String ID, String type) {
        this.ID = ID;
        this.type = type;
    }

    /**
     * Phương thức ghi đè
     * Khởi động phương tiện
     * @return void
     */
    @Override
    public void start(){
        System.out.println("TwoWheeler is running");
    }

    /**
     * Phương thức ghi đè
     * Dừng phương tiện
     */
    @Override
    public void stop(){
        System.out.println("TwoWheeler is stopped");
    }

    /**
     * Phương thức ghi đè
     * Phanh
     */
    @Override
    public void brake(){
        System.out.println("TwoWheeler is braking");
    }

    /**
     * Phương thức ghi đè
     * Tăng tốc phương tiện
     * @param speed tốc độ tăng tốc
     */
    @Override
    public void accelerate(int speed){
        System.out.println("TwoWheeler is accelerating to " + speed + "kmph");
    }

    public void showDetails(){
        System.out.println("Vehicle No.: "+STATEID +" " + ID);
        System.out.println("Vehicle Type.: "+ type);
    }

    @Override
    public void addContact(String detail) {

    }

    @Override
    public void callManufacturer(String phone) {

    }

    @Override
    public void makePayment(float amount) {

    }
}
