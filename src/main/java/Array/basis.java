package Array;

public class basis {

    private static int program1(){
        int[] ar = {1,2,3,4,5};
        int target = 3;
        // linear search
        for(int i=0;i<ar.length;i++){
            if(ar[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int res1 = program1();
        System.out.println(res1);
    }
}
