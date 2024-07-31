import classes.EncodeAndDecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strList= Arrays.asList("abc","bcd");
       String str= EncodeAndDecode.encode(strList);
        System.out.println("final list :: "+EncodeAndDecode.decodeString(str));
    }
}