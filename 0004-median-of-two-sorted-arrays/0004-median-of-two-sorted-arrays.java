class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int []arr=new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            arr[m+j]=nums2[j];
        }
        Arrays.sort(arr);
       double median;
        int mid = (m + n) / 2;

        if ((m + n) % 2 == 0) {
            median = (arr[mid - 1] + arr[mid]) / 2.0;
        } else {
            median = arr[mid];
        }

    return median;
        
    }
}