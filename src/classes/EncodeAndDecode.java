package classes;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {

//    public static String encode(List<String> strList){
//
//        StringBuilder ans = new StringBuilder();
//        for (String s : strList) {
//            ans.append((char) s.length()).append(s);
//            //4neet4code4love3you
//        }
//        return ans.toString();
//    }
//    public static List<String> decodeString(String str){
//        List<String> ans = new ArrayList<>();
//        int i = 0, n = str.length();
//        while (i < n) {
//            int size = str.charAt(i++);//4 /i=1
//            //4 /i=5+1
//            System.out.println("size "+size);
//            ans.add(str.substring(i, i + size));//(1,5)
//            i += size;//i=1+4
//        }
//        return ans;
//    }

    public static String encode(List<String> strs) {
        StringBuilder str1= new StringBuilder();
        for(String str:strs){
            str1.append(str.length()).append("#").append(str);
        }
        return str1.toString();
    }

    public static List<String> decode(String str) {

        List<String> ans = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j=i;
            while(str.charAt(j) != '#'){
                j++;//j=1,i=0
            }
            int size=Integer.parseInt(str.substring(i,j));
            i = j+1+size;
            ans.add(str.substring(j+1,i));
        }
        return ans;
    }
}
