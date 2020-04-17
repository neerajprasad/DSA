package java8;

public class defaultExample {
    public static void main(String[] args) {
        Vehicle car = new Car("safari");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.speedDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
        System.out.println(Vehicle.getHorsePower(2500, 480));
    }
}
interface alarm{
    default String turnAlarmOn() {
        return "Turning the vehice alarm on.alarm";
    }
    default String turnAlarmOff() {
        return "Turning the vehicle alarm off. alarm";
    }
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }

}
interface Vehicle{
    String getBrand();
    String speedUp();
    String speedDown();
    default String turnAlarmOn() {
        return "Turning the vehice alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }

}

class Car implements Vehicle,alarm{

    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The car is speeding up";
    }

    @Override
    public String speedDown() {
        return "The car is speeding Down";
    }

    @Override
    public String turnAlarmOn() {
        return Vehicle.super.turnAlarmOn();
    }

    @Override
    public String turnAlarmOff() {
        return alarm.super.turnAlarmOff();
    }
}