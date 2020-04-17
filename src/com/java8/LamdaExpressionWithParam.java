package java8;

import java.sql.SQLOutput;

interface Printable{
    void print(String msg);
}

public class LamdaExpressionWithParam {
    public static void main(String[] args) {
        Printable printable =  new Printable() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        };
        printable.print("wow i did it");

        Printable printable1 =(msg) -> System.out.println(msg);

        printable1.print("hehhe i can do this");
    }

}
