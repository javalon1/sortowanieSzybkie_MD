package com.sda.algorytmy;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
/*        int[] tablica = {3, 1, 2, 4, 5, 6, 7, 8};
        int pivot = tablica[0];
        int ileMniejszych = 0;
        int ileWiekszych = 0;

        // Wyznaczenie dlugosci tablic
        for(int i = 1; i < tablica.length; i++){
            if(pivot > tablica[i]){
                ileMniejszych++;
            } else if(pivot < tablica[i]){
                ileWiekszych++;
            }
        }
        // Zapelnienie tablicy wiekszych
        int[] wieksze = new int[ileWiekszych];

        wieksze = Arrays.copyOfRange(tablica, 1, ileWiekszych);
        System.out.println(Arrays.toString(wieksze));


       *//*for (int i = 0; i < tablica.length; i++){
            if (tablica[i] > pivot){
                wieksze[i - 1] = tablica[i];
            }
        }
        // Zapelnienie tablicy mniejszych
        int[] mniejsze = new int[ileMniejszych];
        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] > pivot){
                mniejsze[i] = tablica[i];
            }
        }*//*
        System.out.println(pivot);
        System.out.println(ileMniejszych);
        System.out.println(ileWiekszych);

        // Zlozenie tablic  MNIEJSZE + PIVOT + WIEKSZE
        *//*int[] merge = new int[tablica.length];
        for(int i = 0; i < tablica.length - wieksze.length - 1; i++){
            tablica[i] = mniejsze[i];
        }
        tablica[mniejsze.length - 1] = pivot;
        for(int i = mniejsze.length; i < tablica.length; i++){
            merge[i] = mniejsze[i];
        }*//*
        System.out.println(Arrays.toString(wieksze));*/


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
//
        int i = 0;
        for (int el : tablica){
            if (el > pivot){
                wieksze[i] = el;
                i++;
            }
        }
        System.out.println(Arrays.toString(wieksze));




    }
}
