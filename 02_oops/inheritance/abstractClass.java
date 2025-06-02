abstract class A {
    void callMe(){
        System.out.println("A");
    }

    abstract void callMetwo();
}

class B extends A{
    void callMe(){
        System.out.println("B");
    }
    void callMetwo(){
        System.out.println("B1");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        B b = new B();
        b.callMe();
        b.callMetwo();

    }
}
