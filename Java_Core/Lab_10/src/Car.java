public class Car implements Icar {
    private String Name;
    private String producer;
    private int year;
    private int seat;
    private float rootPrice;

    @Override
    public float calculateTax() {
        if (seat < 7){
            return rootPrice * 0.6f;
        }
        else return rootPrice * 0.7f;
    }
    @Override
    public float calculatePrice() {
        return rootPrice + calculateTax();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public float getRootPrice() {
        return rootPrice;
    }

    public void setRootPrice(float rootPrice) {
        this.rootPrice = rootPrice;
    }

    @Override
    public void getInfor(){
        System.out.println(Name + " car " + "produced by " + producer + " in " + year + " has" + seat + " seats with the total price is " + rootPrice);
    }
}
