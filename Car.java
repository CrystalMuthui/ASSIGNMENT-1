//Abstract class. This class can contain both implemented and un implemented methods
abstract class Car {
    String honk;

//constructor
Car(String honk){
    this.honk = honk;
}  

//Implementation using a subclass (abstract method)
abstract void startEngine();

//concrete method that is already implemented.
void honkSound(){
    System.out.println("Honk sound: " + honk);
}
}

//concrete class that implements abstract class startEngine
class AutomaticCar extends Car{
    AutomaticCar(String honk){
        super(honk);
    }
    void startEngine(){
        System.out.println("Automatic car starts.");

    }
//Test code
public class Main{
    public void main (String[] args){
        AutomaticCar audi = new AutomaticCar("Beeeeeeep!!");
        audi.startEngine();
        audi.honkSound();
    }
}
}