import Q7_heritage.Boat;
import Q7_heritage.Car;

public class Main {
    public static void main(String[] args) {
        Car supra = new Car("supra", 1);
        System.out.println(supra.doStuff());

        Boat titanic = new Boat("titanic", 121412403);
        System.out.println(titanic.doStuff());

    }
}