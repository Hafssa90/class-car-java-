public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "black" ;
        car.model = "range" ;
        car.speed = 300 ;
        car.nitroSpeed = true ;


        car.Start();
        car.accelerate();
        car.brake();
        car.boost();
        car.Stop();
        car.changeGear();
    }
}