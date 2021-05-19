package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
        // toString() = special method that all objects inherit,
        //              that returns a string that "textually represents" an object.
        //              can be used both implicitly an explicitly

        Car car = new Car();
       // System.out.println(car.toString()); //println works the same with toString and only car
        System.out.println(car);

    }
}
