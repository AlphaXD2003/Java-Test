class A{
    int i;
    A(int i){
        this.i = i;
        System.out.println("A");
    }
    void callme(){
        System.out.println("called from A");
    }
}

class B extends A{
    int j;
    B(int i, int j){
        super(i);
        this.j = j;
        System.out.println("B");
    }
    void callme(){
        // super.callme();
        System.out.println("called from B");
    }
}

class C extends B{
    int k;
    C(int i, int j, int k){
        super(i,j);
        this.k = k;
        System.out.println("C");
    }
    void callme(){
        // super.callme();
        System.out.println("called from C");
    }
}


public class Multilevel {
    public static void main(String[] args) {
        C cob = new C(4,5,6);
        System.out.println(cob.i);
        System.out.println(cob.j);
        System.out.println(cob.k);
        cob.callme();

        A aob;
        aob = new A(2);
        aob.callme();

        aob = new B(2, 3);
        aob.callme();

    }
}
