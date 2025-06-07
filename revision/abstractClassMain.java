abstract class A{
    void sayHello(){
        System.out.println("hello");
    }

    abstract void sayHi();
}

class B extends A{
    int a = 4;
    static int a1 = 5;
    void sayHi(){
        System.out.println("say hi");
    }

    class C{
        int b = 4;
        void sayNothing(){
            System.out.println(a);
            System.out.println(a1);

            System.out.println("say nothing");
        }
    }

    static class D{
        void sayNothing(){
            System.out.println(a1);
            System.out.println("say nothing");
        }
    }

    // void printB(){
    //     System.out.println(b);
    // }
}

public class abstractClassMain {
    public static void main(String[] args) {
        B b = new B();
        B.C c = b.new C();
        c.sayNothing();
        B.D d = new B.D();
        d.sayNothing();
    }
}
