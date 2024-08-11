import classes.EncodeAndDecode;
import classes.MakeChocolate;
import classes.codingbat.Equalisnot;
import classes.codingbat.GHappy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//ghappy
        String str1=" xxggxx";
        String str2 ="xxgxx";
        System.out.println(" str1 : "+ GHappy.gHappy(str1));
        System.out.println(" str2 :  "+GHappy.gHappy(str2));

//        System.out.println(" str1 : "+Equalisnot.equalsIsNot(str1));
//        System.out.println(" str2 :  "+Equalisnot.equalsIsNot(str2));

//        List<String> strList= Arrays.asList("abc","bcd");
//       String str= EncodeAndDecode.encode(strList);
//        System.out.println("final list :: "+EncodeAndDecode.decode(str));

        //make chocolate
//        System.out.println(MakeChocolate.makeChocolate(4, 1, 9));//4
//        System.out.println(MakeChocolate.makeChocolate(4, 1, 10));//-1
    }
}