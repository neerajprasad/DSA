package java.interview;

public class Bus {

    int nosOfWheel;
    String colour;
    String WD;

    public Bus(int nosOfWheel, String colour,String WD) {
        this.nosOfWheel = nosOfWheel;
        this.colour = colour;
        this.WD =WD;
    }
    public void show(){
        System.out.println("colour "+colour+" aNd nos of wheel"+nosOfWheel);
    }
}
