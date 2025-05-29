class forEach {
    public static void main(String[] args) {
        // int array1[];
        // array1 = new int[5];
        int array1[] = new int[5];
        int array2[] = {1,2,3,4,5};
        int array3[][] = new int [4][5];

        for(int i = 0; i < 5; i++){
            array1[i] = i * 2;
        }

        for(int x : array1){
            System.out.println(x);
            // x = array[0]
            // x = array[1]
        }

    }
}
