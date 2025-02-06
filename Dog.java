//Concrete class is a fully functional class
class Dog{
    String name;

    //constructer, to set dog name
    Dog(String realName){
        //Variable to store dog name
        this.name = realName;
    }

    //method to make dog eat
    void eat(){
        System.out.println(name + "is eating ");
    }

//Object to give dog actual name
public static class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Brisky");

        //output Brisky is eating
        dog1.eat();

    }
} 
}
