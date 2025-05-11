class PrimitiveDataType{
    public static void main(String[] args){
        byte num1 = 98;
        // byte num1 = 198; not allowed

        short num2 = 198;
        // short num2 = 156456456498; not allowed

        int num3 = 54565648;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        char character1 = 'a';
        System.out.println(character1);
        char character2 = 9123;
        System.out.println(character2);

        long num4 = 1_000_000_000;
        System.out.println(num4);
        
        double num5 = 12E65; //1.2E66
        System.out.println(num5);
    }
}