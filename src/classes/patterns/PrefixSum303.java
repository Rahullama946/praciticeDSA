package classes.patterns;

public class PrefixSum303 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        NumArray numArray1 = new NumArray(nums1);
        System.out.println("Sum of range (0, 2): " + numArray1.sumRange(0, 2)); // Output: 6 (1+2+3)
        System.out.println("Sum of range (1, 4): " + numArray1.sumRange(1, 4)); // Output: 14 (2+3+4+5)
        System.out.println("Sum of range (2, 2): " + numArray1.sumRange(2, 2)); // Output: 3 (3)

        // Example 2
        int[] nums2 = {-2, 0, 3, -5, 2, -1};
        NumArray numArray2 = new NumArray(nums2);
        System.out.println("Sum of range (0, 2): " + numArray2.sumRange(0, 2)); // Output: 1 (-2+0+3)
        System.out.println("Sum of range (2, 5): " + numArray2.sumRange(2, 5)); // Output: -1 (3-5+2-1)
    }
}
 class NumArray{
     int[] preSum;
        public NumArray(int[] arr){
            preSum =new int[arr.length];
            preSum[0]=arr[0];
            for(int i=1;i<arr.length;i++){
                this.preSum[i] =  preSum[i-1]+arr[i];
            }
        }
        public int sumRange(int left,int right){
            return left>0?this.preSum[right]-this.preSum[left-1]:this.preSum[right];
        }
}
