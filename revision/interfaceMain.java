interface A{
    void sayHello();
}

interface C{
    void sayHi();
}

interface H extends C{
    int a = 4;
    // public abstract 
    void sayNothing();
}



class D{

}

abstract class E implements A, C{
    public void sayHello(){
        System.out.println("hello");
    }
}
class F extends E {
    public void sayHi(){
        System.out.println("hi");
    }
}
class B extends D implements A, C{
    public void sayHello(){
        System.out.println("hello");
    }
    public void sayHi(){
            System.out.println("hi");
    }
}

public class interfaceMain {
    public static void main(String[] args) {
        
    }
}
