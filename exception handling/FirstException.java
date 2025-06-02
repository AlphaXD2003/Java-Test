

public class FirstException {
    static void func1() throws Exception{
            System.out.println();
            throw new Exception("emni");
    }


    static void func2(){
        try {
            func1();
            return;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("From func2");
            return;
        }finally{
            System.out.println("Ami cholbo");
        }

    }

    public static void main(String[] args) {
        int d = 0;
        
        // try{
        //     int a = 42 / d;
        //     System.out.println(a);
        // }catch(Exception e){
        //         System.out.println(e);
        // }

        try{
            int a = 42 / d;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array error");
        }catch(Exception e){
            System.out.println(e);
        }

       

        // try{
        //     int a = 42 / d;
        //     System.out.println(a);
        //     try{
        //         int b = 42 / d;
        //     }catch(Exception e){
        //         System.out.println(e);
        //     }
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        try {
            int a = 5;
            System.out.println(a);
            // throw new Exception("Ayse hi");
            throw new ArithmeticException("icha hoyeche");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
              func1();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        func2();
    }
}
