//Date: 08/10/2026 : Thursday
class Car{
    String color;
    String Brand;
    int speed;

    Car(String color, String Brand,int speed){
        this.color = color;
        this.Brand = Brand;
        this.speed = speed;
    }

    void displayInfo(){
        System.out.println("Color: "+color+ ", Brand: "+Brand+ ", speed: "+speed+" Km/hr");
    }
    void accelerate(int incr){
        int incrementedSpeed = incr;
        speed += incrementedSpeed;

        System.out.println("Increased Speed is :"+speed+" Km/hr");
    }
}
public class Main{
    public static void main(String[] args) {
        Car c1 = new Car("Blue","BMW",360);
        c1.displayInfo();
        c1.accelerate(50);
    }
}
