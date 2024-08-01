import classes.EncodeAndDecode;
import classes.MakeChocolate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> strList= Arrays.asList("abc","bcd");
//       String str= EncodeAndDecode.encode(strList);
//        System.out.println("final list :: "+EncodeAndDecode.decodeString(str));

        //make chocolate
        System.out.println(MakeChocolate.makeChocolate(4, 1, 9));//4
        System.out.println(MakeChocolate.makeChocolate(4, 1, 10));//-1
    }
}