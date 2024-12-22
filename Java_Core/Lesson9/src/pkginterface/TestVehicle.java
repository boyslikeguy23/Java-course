package pkginterface;

public class TestVehicle {
    public static void main(String[] args) {
        TwoWheeler objBike = new TwoWheeler("LA-001", "A");
        objBike.showDetails();
        objBike.start();
        objBike.accelerate(90);
        objBike.brake();
        objBike.stop();
        //Verify the number of command line arguments
        /*

            if(args.length == 3) {
                //Instantiate the TwoWheeler class
                TwoWheeler objBike = new TwoWheeler(args[0], args[1]);
                //Invoke the class methods

            }
            else {
                System.out.println("Usage: java TwoWheeler <first vehicle> <second vehicle>");
            }

         */
    }
}
