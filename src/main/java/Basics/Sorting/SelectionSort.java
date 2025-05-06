package Sorting;

public class SelectionSort {

    private static void program1(){
        int[] nums = {5,4,3,2,1};
        for(int i=0;i<nums.length-1;i++){
            int mini = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] < nums[mini]){
                    mini = j;
                }
            }
            if(mini!=i){
                int temp = nums[mini];
                nums[mini] = nums[i];
                nums[i] = temp;
            }
        }

        for(int x : nums){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        program1();
    }
}
