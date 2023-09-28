public class pattern1 {

    public static void main(String[] args) {
        int n =4;
        pattern9(n);
    }
    static void pattern(int n){
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    /*

     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *

     */
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        /*

         * * * * *
         * * * *
         * * *
         * *
         *

         */
        for (int row = 1 ; row<= n ;row++){
            for(int col = 1 ;col <= n-row+1 ;col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        for(int row =1 ; row <= n;row++){
            int count = 0;
            for(int col = 1; col <= row;col ++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    static void pattern4(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsinRow = row > n ? 2 * n  - row  : row;
            for(int col = 0; col <totalColsinRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
           *
         * *
       * * *
     * * * *
     */
    static void pattern5(int n){
        int m =1;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=m;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
            m++;

        }
    }
    /*
        *
       * *
      * * *
     * * * *
      * * *
       * *
        *
     */

    static void pattern6(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsinRow = row > n ? 2 * n  - row  : row;

            int noOfSpaces = n-totalColsinRow;
            for(int s =0; s<noOfSpaces;s++){
                System.out.print(" ");
            }
            for(int col = 0; col <totalColsinRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
            1
           212
          32123
         4321234
        543212345
     */
    static void pattern7(int n){
        for (int row = 1; row <= n ; row++) {
            for(int s =0; s<n-row;s++){
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    /*
            1
           212
          32123
         4321234
        543212345
         4321234
          32123
           212
            1
     */
    static void pattern8(int n){
        for (int row = 1; row <=2* n ; row++) {
            int c = row > n ? 2 * n  - row  : row;

            for(int s =0; s<n-c;s++){
                System.out.print("  ");
            }
            for (int col = c; col >= 1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= c ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

   /*
0 0 0 0 0 0 0 0 0
0 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 3 4 3 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 2 2 2 2 1 0
0 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0
    */
    static void pattern9(int n){
        n = 2*n;
        for (int row = 0; row <= n ; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }


}
