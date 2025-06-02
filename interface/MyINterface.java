interface Callback{
    void callme(int a);
}

 interface AnotherInterface {

    void callme1(int a);
}

interface Another{
    void sayHello();
    void sayHi();
}

abstract class B implements Another{
    public void sayHello(){
        System.out.println("Hello");
    }
    
}


public class MyINterface extends B implements Callback,AnotherInterface  {
    public void sayHi(){
        System.out.println("Hi");
    }
    public void callme(int a){
        System.out.println(a);
    }
    public void callme1(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        Callback ob = new MyINterface();
        ob.callme(4);
    }
}
