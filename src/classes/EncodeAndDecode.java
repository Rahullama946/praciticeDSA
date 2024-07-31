package classes;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {

    public static String encode(List<String> strList){

        StringBuilder ans = new StringBuilder();
        for (String s : strList) {
            ans.append((char) s.length()).append(s);
        }
        return ans.toString();
    }
    public static List<String> decodeString(String str){
        List<String> ans = new ArrayList<>();
        int i = 0, n = str.length();
        while (i < n) {
            int size = str.charAt(i++);
            System.out.println("size "+size);
            ans.add(str.substring(i, i + size));
            i += size;
        }
        return ans;
    }
}
