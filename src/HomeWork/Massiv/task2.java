package HomeWork.Massiv;

public class task2 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6};

        int[] array2 = new int[]{ 4, 5, 6};
        int[] summ = new int[3];

//        for (int i = 0; i < array.length; i++){
//            for (int j = 0; j < array2.length; j++){
//                summ[i] = array[i] + array2[j];
//            }
//        }
//        System.out.println(summ);
        for (int i = 0; i < array.length; i++){
            summ[i] = array[i] + array2[i];
        }
        for (int i = 0; i < summ.length; i++){
            System.out.println(summ[i]);
        }
        }

}
