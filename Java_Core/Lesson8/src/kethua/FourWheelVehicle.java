package kethua;
public class FourWheelVehicle extends Vehicle{
    private boolean powerSteer;
    public FourWheelVehicle() {}
    public FourWheelVehicle(String vId, String vName, int nWheels, boolean powerSteer) {
        vehicleNo = vId;
        vehicleName = vName;
        wheels = nWheels;
        this.powerSteer = powerSteer;
    }
    public void showDetail(){
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Wheels: " + wheels);
        System.out.println("Power Steer: " + powerSteer);
    }
    public void accelerate(int speed){
        super.accelerate(speed);
        System.out.println("Four Wheel accelerated");
    }

    public static void main(String[] args){
        FourWheelVehicle fwv = new FourWheelVehicle("A001", "ABC", 4, true);
        fwv.showDetail();
        fwv.accelerate(1000);
        //FourWheelVehicle fwv2 = new Vehicle();
        Vehicle fwv3 = new FourWheelVehicle("A001", "ABC", 4, true);
    }
