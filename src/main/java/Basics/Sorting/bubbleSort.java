package Sorting;

public class bubbleSort {

    private static void bubbleSorting(int[] ans){
        int n = ans.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if(ans[j] > ans[j+1]){
                    int temp = ans[j];
                    ans[j] = ans[j+1];
                    ans[j+1] = temp;
                }
            }
        }
        for(int x : ans){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        int[] ar = {5,4,3,2,1};
        bubbleSorting(ar);
    }
}
