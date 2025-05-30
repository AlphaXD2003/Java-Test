class outerClass{
    int i ;
    static int k = 0;
    outerClass(int i){
        this.i = i;
    }

    public innerClass returnInnerClassObject(int j){
        innerClass ob = new innerClass(j);
        return ob;
    }
    public void callIt(int i){
        innerClass ob = new innerClass(i);
        ob.sayHello();
    }
        class innerClass{
            int j;
            innerClass(int j){
                this.j = j;
            }
            public void sayHello(){
                System.out.println("Hello");
            }
        }
        
        static class innerClass1{
        int j;
        innerClass1(int j){
            this.j = j;
        }
        int returnSomething(){
            return k;
        }
        public void sayHello(){
            System.out.println("Hello");
        }
    }
}

class innerOuterClass {
    public static void main(String[] args) {
        outerClass oc = new outerClass(2);
        System.out.println(oc.i);
        // innerClass ic1 = new innerOuterClass(4);
        oc.callIt(45);
        outerClass.innerClass1 ic2 = new outerClass.innerClass1(5);
        System.out.println(ic2.j);
        // outerClass.innerClass1 ic3 = new oc.returnInnerClassObject(5);



    }
}
