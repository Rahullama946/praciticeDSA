package classes;

//We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
//Return the number of small bars to use, assuming we always use big bars before small bars.
//Return -1 if it can't be done.
public class MakeChocolate {
    public static int makeChocolate(int small, int big, int goal) {
        int bigKilos=big*5;
        int total=bigKilos+small;
        if(bigKilos==goal){
            return 0;
        } else if(bigKilos>goal){
            if(small>=(goal%5)){
                return goal%5;
            }else{
                return -1;
            }
        }else{
            if(small>=(goal-bigKilos)){
                return goal-bigKilos;
            }
            return -1;
        }
    }
}
