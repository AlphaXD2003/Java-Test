import java.lang.Enum;
class Week{
    String day;
    Week(String day){
        this.day = day;
    }

    String returnDay(){
        return day;
    }
}

enum Week1{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}


// enum Week1{
//     Sunday(1, 10), Monday(2, 20), Tuesday(3,30), Wednesday, Thursday, Friday, Saturday
        // private final int day;
        // private final int score;

        // Week1(int day, int score){
        //         this.day = day;
        //         this.score = score;

        // }
// }

// final class Week1 extends Enum<Week1> {
// Week1 Sunday = new Week1(1, 10);
//} 

enum Level{
    low(20), medium(50), high(100);
    private final int score;

    Level(int score){
        this.score = score;
    }

    public int returnScore(){
        return score;
    }
}

public class Enumerations {
    public static void main(String[] args) {
        Week wk = new Week("someday");
        System.out.println(wk.returnDay());


        Week1 wk1;
        wk1 = Week1.Sunday;
        System.out.println(wk1);
        // wk1 = Week1.Someday; //error
        int a = 20;
        char b = 'A';
        Level level = Level.low;

        switch (level) {
            case low:
                System.out.println("low");
                break;
            case medium:
                System.out.println("med");
                break;
            case high:
                System.out.println("high");
                break;
            default:
                System.out.println("Enter something valid");
        }

        int sc = level.returnScore();
        System.out.println(sc);
        level = Level.high;
        System.out.println(level.returnScore());

        int array[] = {1,2,3};
        for (int x : array){
            System.out.println(x);
        }

        System.out.println(Level.values());
        for(Level l : Level.values()){
            System.out.println(l.returnScore());
        }
        level = Level.high;
        System.out.println(Level.valueOf("low"));
        // System.out.println(Level.valueOf("low1"));

    }
}
