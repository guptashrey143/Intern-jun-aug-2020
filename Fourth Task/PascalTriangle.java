package FourthTask;

/// Program to display the PascalTriangle of N lines.

public class PascalTriangle {

    public static int[] pascalTree(int n){
        int array[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    array[i][j] = 1;
                }else{
                    array[i][j] = array[i-1][j-1] + array[i-1][j];
                }
            }
        }
        return array[n-1];

    }



    public static void main(String[] args) {
        int n = 10;
        pascalTree(n);
        int array[]  = pascalTree(n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
