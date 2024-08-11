package classes.codingbat;

public class GHappy {
    public static boolean gHappy(String str) {
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='g'){
                boolean left=(i>0 && str.charAt(i-1)=='g');
                boolean right=(i<str.length()-1 && str.charAt(i+1)=='g');

                if(!(left || right)){//using de morgans law !a && !b == !(a || b);
                    return false;
                }
            }

        }
        return true;

    }
}