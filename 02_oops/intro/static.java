class AccessModifier{
    public int i;
    private int j;
    // protected 
    AccessModifier(int i, int j){
        this.i = i;
        this.j = j;
    }
    public int returnJ(){
        return j; //this.j
    }

}

class staticClass{
    public static int a = 0;
    private int i = 0;
    staticClass(int i){
        System.out.println("Constructor is called");
        a = a + 1;
        this.i = i;
    }

    public int getI(){
        return this.i;
    }

    public static void changeA(){
        a = a +1;
        // i = i +1;
        // this.i //error
    }

    static {
        System.out.println("Static is initialized");
    }
}


class passByReference{
    int a ;
    passByReference(int a){
        this.a = a;
    }

    public void changeA(passByReference ob, int a){
        ob.a = a;
    }

    public passByReference returnNewObject(int i){
        passByReference obj = new passByReference(i);
        return obj;
    }
    public static passByReference returnNewObjectFromClass(int i){
        passByReference obj = new passByReference(i);
        return obj;
    }
}

class Static{
    public static void main(String[] args) {
        AccessModifier obj1 = new AccessModifier(4, 5);
        System.out.println(obj1.i);
        // System.out.println(obj1.j);
        System.out.println(obj1.returnJ());
        System.out.println(staticClass.a);
        staticClass ob = new staticClass(5);
        staticClass ob2 = new staticClass(5);
        staticClass ob3 = new staticClass(5);
        ob3.changeA();

        // ob.a;
        System.out.println(staticClass.a);
        System.out.println(args.toString());

        passByReference pOb = new passByReference(5);
        passByReference pOb1 = new passByReference(6);

        System.out.println(pOb.a);
        System.out.println(pOb1.a);
        pOb.changeA(pOb1, 7);
        System.out.println(pOb1.a);

        passByReference pOb2 = pOb1.returnNewObject(78);
        passByReference pOb3 = passByReference.returnNewObjectFromClass(89);
        
    }
}