package Lab2;

class Vehicle{
    int year;
    String manufacturer;
    int speed;

    public void accelerate(){
        speed+=5;
    }
    public void brake(){
        speed-=5;
    }

}
public class Question6 {
    public static void main(String[] args) {
        Vehicle rickshaw = new Vehicle();
        rickshaw.speed=15;

        for (int i = 1; i <= 5; i++) {
            rickshaw.accelerate();
            System.out.print(rickshaw.speed+" ");
        }
        System.out.println();

        for (int i = 1; i <= 2; i++) {
            rickshaw.brake();
            System.out.print(rickshaw.speed+" ");
        }
        System.out.println();

        Vehicle bike = new Vehicle();
        bike.speed=50;

        for (int i = 1; i <= 5; i++) {
            bike.accelerate();
            System.out.print(bike.speed+" ");
        }
        System.out.println();

        for (int i = 1; i <= 2; i++) {
            bike.brake();
            System.out.print(bike.speed+" ");
        }
    }
}
