/*
https://codingbat.com/prob/p155405

Given n>=0, create an array length n*n with the following pattern, 
shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */
public class squareUp {
    public static void main(String[] args) {
        int n=0;

        int[] result = squareUp(n);

        for (int i=0; i<result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] squareUp(int n) {

        int[] A = new int[n*n];
        int ic = 0;

        for (int i=n; i>0; i--) {
            int x = n*i - 1;
            int v = 1;

            for (int k=x; k>x-n-ic; k--) {
                A[k]=v;
                v++;
            }
            ic--;
        }
        return A;
    }
}

