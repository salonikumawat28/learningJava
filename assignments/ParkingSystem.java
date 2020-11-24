package assignments;

public class ParkingSystem {
    int big;
    int medium;
    int small;

    // Constructor
    public ParkingSystem(int big , int medium , int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    boolean addCar(int carType) {
        boolean result = false;
        switch(carType) {
            case 1: 
            if (big > 0) {
                big--;
                result = true;
            } 
            break;

            case 2:
            if (medium > 0) {
                medium--;
                result = true;
            } 
            break;

            case 3:
            if (small > 0) {
                small--;
                result = true;  
            } 
            break;

            default :
            System.out.println("Invalid Car Type");
            break;
            

        }
        return result;
    }

    public static void main(String args[]) {
        boolean result;
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 1);

        result = parkingSystem.addCar(1);
        System.out.println("For car type [1] parking avaliable is ..." + result);
        result = parkingSystem.addCar(2);
        System.out.println("For car type [2] parking avaliable is...." + result);
        result = parkingSystem.addCar(3);
        System.out.println("For car type [3] parking avaliable is...." + result);
        result = parkingSystem.addCar(1);
        System.out.println("For car type [1] parking avaliable is...." + result);
        result = parkingSystem.addCar(4);

    }

    
}
