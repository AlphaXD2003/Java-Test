class Goddess{
    int age ;
    int semester ;
    Goddess(){
        age = 21;
        semester = 2;
    }
    // Goddess(int a, int b){
    //     this.age = a;
    //     this.semester = b;
    // }
    Goddess(int age, int semester){
        this.age = age;
        this.semester = semester;
    }
    
    int returnNumber(){
        return 1;
    }
    int returnAge(){
        // return this.age;
        return age;
    }
    int returnAge(Goddess ob){
        return ob.age;
    }
    void sayHello(){
        System.out.println("Hello");
    }
    void sayHello(int a){
        System.out.println("Hello "+a);
    }
}

public class constructor {
    public static void main(String[] args) {
        Goddess sayoni = new Goddess(21, 1);
        System.out.println(sayoni.age);

        Goddess labu = new Goddess(22, 2);
        System.out.println(labu.age);

        int age = sayoni.returnAge();
        System.out.println(age);
        sayoni.sayHello();
        sayoni.sayHello(20);

        int returnedAge = sayoni.returnAge(sayoni);
        System.out.println(returnedAge);
    }
}
