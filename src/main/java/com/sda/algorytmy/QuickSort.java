package com.sda.algorytmy;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {

        int[] tablica = {7, 1, 9, 3, 0, 8, 6, 4};



        if (tablica.length < 2) {
            //return tablica;
        } else if (tablica.length == 2) {
            if (tablica[0] > tablica[1]) {
                int temp = tablica[0];
                tablica[0] = tablica[1];
                tablica[1] = temp;
                //return tablica;
            }
        }

        int pivot = tablica[0];
        int ileMniejszych = 0;
        int ileWiekszych = 0;

        // Wyznaczenie dlugosci tablic
        for (int i = 1; i < tablica.length; i++) {
            if (pivot > tablica[i]) {
                ileMniejszych++;
            } else if (pivot < tablica[i]) {
                ileWiekszych++;
            }
        }
        System.out.println(ileMniejszych);
        System.out.println(ileWiekszych);



        // Zapelnienie tablicy wiekszych
        int i = 0;
        int[] wieksze = new int[ileWiekszych];
        for (int el : tablica) {
            if (el > pivot) {
                wieksze[i] = el;
                i++;
            }
        }

        System.out.println(Arrays.toString(wieksze));


        //quickSort(wieksze);

        // Zapelnienie tablicy mniejszych
        int j = 0;
        int[] mniejsze = new int[ileMniejszych];
        for (int el : tablica) {
            if (el < pivot) {
                mniejsze[j] = el;
                j++;
            }
        }
        System.out.println(Arrays.toString(mniejsze));


        //quickSort(mniejsze);


        // Zlozenie tablic  MNIEJSZE + PIVOT + WIEKSZE
        int[] merge = new int[tablica.length];

        System.arraycopy(mniejsze, 0, merge, 0, mniejsze.length);
        merge[mniejsze.length] = pivot;
        System.arraycopy(wieksze, 0, merge, mniejsze.length + 1, wieksze.length);
        System.out.println(Arrays.toString(merge));

        //return merge;
    }
}
