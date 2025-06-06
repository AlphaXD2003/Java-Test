
class Person{
    String name;
    char gender;
    int age ;

    Person(){
    // this = {}
     name = "sayoni"; // this.name = "sayoni";
     gender = 'F'; // this.gender = "F";
     age = 21; // this.age = 21;
     // return this
    }

    Person(String a, char b, int c){
        name = a;
        gender = b;
        age = c;
    }

    Person(int a, int b, int c){
        name = new String();
        gender =(char) b;
        age = c;
    }
}

class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");

        int a = 20;

        Person sayoni;
        sayoni = new Person();
        System.out.println(sayoni.age);
        Person subhamoy = new Person("subhamoy" , 'M' , 22);
        System.out.println(subhamoy.age);
    }
}