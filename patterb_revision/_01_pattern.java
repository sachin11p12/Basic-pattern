package patterb_revision;

import java.util.Scanner;

public class _01_pattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int n = sc.nextInt();

         *
         * *
         * * *
         * * * *
         * * * * *


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        5 5 5 5 5
        4 4 4 4
        3 3 3
        2 2
        1

        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
           * * * * *
           * * * *
           * * *
           * *
           *


        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
           *
          * *
         * * *
        * * * *
       * * * * *


        int n = 5;
        for (int i = 0; i < n ; i++) {
            for (int j =0; j<n-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        * * * * *
         * * * *
          * * *
           * *
            *

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
            *
           * *
          * * *
         * * * *
        * * * * *
        * * * * *
         * * * *
          * * *
           * *
            *

        int n = 5;
        for (int i = 0; i < n ; i++) {
            for (int j =0; j<n-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
     0123456789
         *
        *A*
       *A*A*
      *A*A*A*
     *A*A*A*A*

        for (int i=1;i<=n;i++){
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                if (j%2==1 )
                    System.out.print("*"+" ");
                else
                    System.out.print("A"+" ");
            }
            System.out.println();
        }

        1
        2 3
        4 5 6
        7 8 9 10

        int  a=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print((char) (j+64)+" ");
                a++;
            }
            System.out.println();
        }

    1
    A B
    1 2 3
    A B C D
    1 2 3 4 5





        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i%2==0)
                    System.out.print((char) (j+64)+" ");
                else
                    System.out.print(j+" ");
            }
            System.out.println();
        }
        *
        *
    * * * * *
        *
        *

        int mid = n/2+1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==mid || j==mid){
                    System.out.print("*"+" ");
                }
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }

        *   *
         * *
          *
         * *
        *   *


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==j || (i+j)==n+1)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
        1
        0 1
        1 0 1
        0 1 0 1

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i==j || (i+j)%2==0)
                    System.out.print("1"+" ");
                else
                    System.out.print("0"+" ");
            }
            System.out.println();
        }                     1
         *                  1 2
       * *         OR     1 2 3
     * * *              1 2 3 4
   * * * *


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
         }

         OR

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
      * * * *
    * * * *
  * * * *
* * * *


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
