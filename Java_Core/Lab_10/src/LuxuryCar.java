public class LuxuryCar extends Car {
    private float specialRate;
    @Override
    public float calculatePrice(){
        return getRootPrice() + calculateTax() + getRootPrice()*specialRate;
    }
    public float calculatePrice(float transportCost){
        return getRootPrice() + calculateTax() + transportCost;
    }

    public float getSpecialRate() {
        return specialRate;
    }

    public void setSpecialRate(float specialRate) {
        this.specialRate = specialRate;
    }
}
