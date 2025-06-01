class Animal{
    String name = "generic";
    int legs;
    String sound = "generic";
    Animal(int legs){
        this.legs = legs;
    }

    void call(){
        System.out.println(sound);
    }

}

class Dog extends Animal{
    String name = "dog";
    String sound = "bark";
    boolean isPet;
    Dog(int legs, boolean isPet){
        super(legs);
        this.isPet = isPet;
    }
    void call(){
        System.out.println(sound);
        System.out.println(legs);

    }
    void call(int a){
        super.call();
        System.out.println(super.name);
        System.out.println(a);
    }
}


public class inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog(4, true);
        dog.call();
        dog.call(1);

    }
}
