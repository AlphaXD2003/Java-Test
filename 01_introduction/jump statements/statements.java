public class statements {
   public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            if(i == 3){
                // break;
                continue;
            }
            System.out.println(i);
        }

       
        outer: {
            for(int j = 0; j < 2; j++){
                    inner:{
                        for(int i = 0; i < 2; i++){
                        if(i == 1){
                            break inner;
                        }
                        System.out.println(i);
                    }
                    }
            }
        }
        
   } 
}
