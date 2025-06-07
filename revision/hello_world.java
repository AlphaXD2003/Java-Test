





class Person{
    public String name;
    private char gender;
    int age ;

    static int count  = 0;

    Person(){
        count  = count +1;
    // this = {}
     name = "sayoni"; // this.name = "sayoni";
     gender = 'F'; // this.gender = "F";
     age = 21; // this.age = 21;
     // return this
    }

    static {
        System.out.println("I run once.");
    }

    Person(String a, char b, int c){
        count  = count +1;
        name = a;
        gender = b;
        age = c;
    }

    Person(int a, int b, int c){
        count  = count +1;
        name = new String();
        gender =(char) b;
        age = c;
    }

    static void printCount(){
        System.out.println(count);
    }

    void walk(){
        System.out.println(count);
        System.out.println(this.name + " can walk.");
    }

    int returnAge(){
        return age; //return this.age;
    }

    public char returnGender(){
        return gender;
    }
}

class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");

        int a = 20;
        System.out.println(Person.count);
        Person sayoni;
        sayoni = new Person();
        System.out.println(sayoni.age);
        Person subhamoy = new Person("subhamoy" , 'M' , 22);
        System.out.println(subhamoy.age);

        sayoni.walk();
        System.out.println(sayoni.returnAge());
        System.out.println(sayoni.name);
        // System.out.println(sayoni.gender);
        System.out.println(sayoni.returnGender());
        char gender = sayoni.returnGender();

        System.out.println(Person.count);
        Person.printCount();

    }
}