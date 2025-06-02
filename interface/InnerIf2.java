interface A{
    void callme();
    void callme1();

}

 interface B extends A {
    void callme2();
    
}

class C implements B{
    public void callme(){
        System.out.println(1);
    }
    public void callme1(){
        System.out.println(0);
    }
    public void callme2(){
        System.out.println(2);
    }
}

public class If2 {
    
}
