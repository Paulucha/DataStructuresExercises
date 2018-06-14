package arrays;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {


        int[] array = new int[10];                               //10 elementową tablicę, przechowującą liczby całkowite z wartościami domyślnymi
        int[] array2 = new int[0];                               // tablica składająca się z 0 elementów
        String[] array3 = new String[5];                         // wskaźnik na tablicę przechowującą stringi
        double[] array4 = new double[]{3.4, 5.6, 2.3};           // tablicę liczb zmiennoprzecinkowych, zainicjowaną 3 dowolnymi wartościami
        int[][] array5 = new int[5][2];                          //tablicę wielowymiarową


        double[] array6 = new double[]{3.4, 5.6, 2.3, 3.5, 7.6};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array5));


        double score = array6[0];

        for (int i = 1; i < array6.length; i++) {
            if (score < array6[i]) {
                score = array6[i];
            }

        }
        System.out.println();
        System.out.println("Największy element " + score);
    }


}

