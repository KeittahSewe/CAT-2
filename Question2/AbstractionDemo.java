abstract class Appliance {
   
    abstract void turnOn();
}

// Subclass Fan
class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan on!");
    }
}

// Subclass TV
class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV on!");
    }
}

// Main class
public class AbstractionDemo {
    public static void main(String[] args) {
        // Using abstraction 
        Appliance myFan = new Fan();
        Appliance myTV = new TV();

        myFan.turnOn(); 
        myTV.turnOn();  
    }
}
