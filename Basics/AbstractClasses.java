abstract class Vehicle{

    String type;
    Vehicle(){

        System.out.println("Vehicle Created");

    }

    abstract int getWheelCount();
    abstract void getVehicle(String type);

    void Brand(){
        System.out.println("Honda");
    }
}

class Car extends Vehicle{

    Car(){
        System.out.println("Car created");
    }

    int getWheelCount(){
        return 4;
    }
    
    void getVehicle(String type){

        this.type=type;

    } 

}

class Bike extends Vehicle{

    Bike(){
        System.out.println("Bike created");
    }

    int getWheelCount(){
        return 2;
    }

    void getVehicle(String type){

        this.type=type;

    } 

}


public class  AbstractClasses {
    public static void main(String[] args) {
        Vehicle bike=new Bike();
        bike.Brand();
        System.out.println("Wheels are "+(bike.getWheelCount()));

        bike.getVehicle("Dirt");
        System.out.println(bike.type);

    }
}