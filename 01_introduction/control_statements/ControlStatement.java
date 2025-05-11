
public class ControlStatement {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 100;

        /* Multi line Comment*/

        // if(num1 > num2){
        //     System.out.println("num1 is greater");
        // }
        // else if(num1 == num2){
        //     System.out.println("both are same");
        // }
        // else{
        //     System.out.println("num2 is greater");
        // }

        int result = (num1 >= num2)? num1 : num2;
        System.out.println(result);

        // switch case
        int choice = 4;

        switch (choice) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
            System.out.println(0);
                break;
        }
    }
}
