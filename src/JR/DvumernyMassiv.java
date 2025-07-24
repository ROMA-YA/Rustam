package JR;

public class DvumernyMassiv {
    public static void main(String[] args) {
        int n = 10;
        int[][] array = new int[n][];

        for (int i = 0; i < n; i++){
            array[i] = new int [i + 1];
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = i + j;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
