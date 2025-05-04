package Basics;

public class pattern {
    static final int n = 5;
    private static void pattern1(){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

        private static void pattern5(){
            for(int i=1;i<=n;i++){
                for(int j=1;i<=n-i;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=2*i+1;j++){
                    System.out.print("* ");
                }
                for(int j=1;j<n;j++){
                    System.out.print("  ");
                }
                System.out.println();
            }
        }





    public static void main(String[] args) {
        pattern1();
        pattern2();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();
        System.out.println();
        pattern5();
    }
}
