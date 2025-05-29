class Test{
   // memeber vairables
   int width = 30;
   int length = 40;
   int height = 50;

   //member functions /methods
   void sayHello(){
      System.out.println("Hello");
   }
}

class classAndObj {
   public static void main(String[] args) {
    Test a;
    a = new Test();
    System.out.println(a.height);
    Test b = new Test();
    System.out.println(b.width);
    Test c = a;
    a = null;
    a = new Test();
    c.height = 70;
    System.out.println(c.height);
    System.out.println(b.height);
    Test d = c;
    System.out.println(d.height);
    d.sayHello();
    b.sayHello();
   } 
}
