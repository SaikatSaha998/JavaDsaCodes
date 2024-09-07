class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3};
        double ans = findMedianSortedArrays(nums1, nums2);
        System.out.println(ans);
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1 = nums1.length; 
        int b1 = nums2.length; 
        
        int c1 = a1 + b1; 
        int[] mergedArray = new int[c1]; 
  
        for(int i = 0; i < a1; i++) {
            mergedArray[i] = nums1[i];
        }
        for(int i = 0; i < b1; i++) {
            mergedArray[a1 + i] = nums2[i];
        }
        //Arrays.sort(mergedArray);
        double ans = 0;
        int mid = c1 / 2;
        if(c1 % 2 == 0) {
            ans = (double)(mergedArray[mid] + mergedArray[mid + 1]) / 2;
        }
        else {
            ans = mergedArray[mid];
        }
    return ans;
    }
}