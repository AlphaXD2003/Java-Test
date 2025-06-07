class Animal{
    protected String species;
    Animal(){
        this.species = "generic";
    }

    Animal(String species){
        this.species = species;
    }

    void sound(){
        System.out.println("Generic Sound.");
    }

    void sound(int a){
        System.out.println("Generic Sound.");
    }
}

 class Dog extends Animal {
    int legs;
    final int hands = 0;
    // DOG(){}

    // Dog(){
    //     this.legs = 4;
    // }

    Dog(int legs){
        super("dog1");
        this.legs = legs;
        // this.hands = 1;
    }
    Dog(int legs, String species){
        super(species);
        this.legs = legs;
    }


    //  final void sound(){
    //     super.sound();
    //     super.sound(1);
    //     System.out.println(super.species);
    //     System.out.println("bark.");
    // }

     void sound(){
        super.sound();
        super.sound(1);
        System.out.println(super.species);
        System.out.println("bark.");
    }
}

class Boxer extends Dog{
    Boxer(int legs){
        super(legs);
    }
    void sound(){
        
        System.out.println("boxer bark.");
    }
}

public class another {
    public static void main(String[] args) {
        Dog dg = new Dog(4, "dog");
        System.out.println(dg.legs);
        System.out.println(dg.species);

        dg.sound();

        Dog dg1 = new Dog(4);

        Animal animal;
        animal = new Dog(4);

        Animal animal1 = new Boxer(4);

        Animal an;
        an = new Animal();
        an.sound();

        an = new Dog(4);
        an.sound();

        an = new Boxer(4);
        an.sound();

    }
}
