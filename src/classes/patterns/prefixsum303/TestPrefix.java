package classes.patterns.prefixsum303;

public class TestPrefix {

    public static void main(String[] args) {
        // Example 2
        int[] nums2 = {-2, 0, 3, -5, 2, -1};
        PrefixSum numArray2 = new PrefixSum(nums2);
        System.out.println("Sum of range (0, 2): " + numArray2.sumRange(0, 2)); // Output: 1 (-2+0+3)
        System.out.println("Sum of range (2, 5): " + numArray2.sumRange(2, 5)); // Output: -1 (3-5+2-1)

        int[] nums1 = {1, 2, 3, 4, 5};
        PrefixSum numArray3 = new PrefixSum(nums1);
        System.out.println("Sum of range (0, 2): " + numArray3.sumRange(0, 2)); // Output: 6 (1+2+3)
        System.out.println("Sum of range (1, 4): " + numArray3.sumRange(1, 4)); // Output: 14 (2+3+4+5)
        System.out.println("Sum of range (2, 2): " + numArray3.sumRange(2, 2)); // Output: 3 (3)

    }
}
class PrefixSum{
    int[] finalSumArr;
    public PrefixSum(int[] arr){
        finalSumArr=new int[arr.length];
        finalSumArr[0]=arr[0];
        for(int i=1;i<arr.length; i++){
         this.finalSumArr[i]=this.finalSumArr[i-1]+arr[i];
        }
    }
     int sumRange(int l,int r){
        return l>0?this.finalSumArr[r]-this.finalSumArr[l-1]:this.finalSumArr[r];
    }
}
