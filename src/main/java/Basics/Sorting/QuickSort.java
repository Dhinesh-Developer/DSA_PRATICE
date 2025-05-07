package Sorting;

public class QuickSort {
    private static int partition(int[] nums,int low,int high){
        int pivot = nums[low];
        int i=low,j=high;
        while(i<j){
            while(nums[i] < pivot && i<=high-1){
                i++;
            }
            while(nums[j] >pivot && j>=high+1){
                j--;
            }
            if(i<j){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }
    private static void qs(int[] nums,int low,int high){
        if(low<high){
            int pIndex = partition(nums,low,high);
            qs(nums,low,pIndex-1);
            qs(nums,pIndex+1,high);
        }
    }
    public static void main(String[] args) {

        int[] nums = {1,2,5,4,3,6,7,6,4};
        int low = 0;
        int high = nums.length-1;
        qs(nums,low,high);
        for(int x : nums){
            System.out.print(x+" ");
        }
    }
}
