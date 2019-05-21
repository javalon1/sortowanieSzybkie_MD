package com.sda.algorytmy;

public class Test {
    public static void main(String[] args) {






        int[] tablica = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] tablica2 = {10, 11, 12, 13, 14, 15, 16, 17};
        int pivot = 3;
        int[]merge = new int[tablica.length + tablica2.length + 1];

        //merge = Arrays.copyOfRange(tablica, 2, tablica.length - 1);
        //merge = Arrays.copyOfRange(tablica2, 2, tablica.length - 1);
        //merge = Arrays.copyOfRange(pivot);

//        System.arraycopy(tablica, 0, merge, 0, tablica.length);
//        merge[tablica.length] = pivot;
//        System.arraycopy(tablica2, 0, merge, tablica.length + 1, tablica2.length);

//        System.out.println(Arrays.toString(merge));
//        System.out.println(merge.length);

        int ileWiekszych = 4;
        int[] wieksze = new int[ileWiekszych];

//        for (int i = 0; i < ileWiekszych; i++){
//            if (tablica[i] > pivot){
//                wieksze[i] = tablica[i];
//            }
//        }


    }
}
