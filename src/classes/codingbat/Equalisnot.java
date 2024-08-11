package classes.codingbat;
public class Equalisnot {
    public static boolean equalsIsNot(String str){
        String newStr=str.replaceAll("//s","");
        int count1=0,count2=0;
        for(int i=0;i<=str.length()-1;i++){
            if(str.substring(i,i+2).equals("is")){
                count1++;
            }
        }
        for(int i=0;i<str.length()-2;i++){
            if(str.substring(i,i+3).equals("not")){
                count2++;
            }
        }
        System.out.println(" coun 1 :"+count1+" count2 "+count2);
    return count1 == count2;
    }
}
