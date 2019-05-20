package com.sda.algorytmy;


import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {

        int[] arr = {2, 4, 6, 2, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println(suma(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(quickSort(arr)));

    }

    // Rekurencyjne sumowanie tablicy
    public static int suma(int[] tab){
        if(tab.length == 0){
            return 0;
        }
        int[] tab2 = new int[tab.length - 1];
        // tab = Arrays.copyOfRange(tab, 1, tab.length);  KROTSZA WERSJA
        for(int i = 0; i < tab.length - 1; i++){
            tab2[i] = tab[i + 1];
        }
        return tab[0] + suma(tab2);
    }



    public static int[] quickSort(int[] tablica){
        if(tablica.length < 2){
            return tablica;
        } else if (tablica.length == 2){
            if (tablica[0] > tablica[1]){
                    int temp = tablica[0];
                    tablica[0] = tablica[1];
                    tablica[1] = temp;
                    return tablica;
            }
        }


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
        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] > pivot){
                wieksze[i] = tablica[i];
            }
        }
        // Zapelnienie tablicy mniejszych
        int[] mniejsze = new int[ileMniejszych];
        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] > pivot){
                mniejsze[i] = tablica[i];
            }
        }
        // Zlozenie tablic  MNIEJSZE + PIVOT + WIEKSZE
        int[] merge = new int[tablica.length];
        for(int i = 0; i < tablica.length - wieksze.length - 1; i++){
            tablica[i] = mniejsze[i];
        }
        tablica[mniejsze.length - 1] = pivot;
        for(int i = mniejsze.length; i < tablica.length; i++){
            merge[i] = mniejsze[i];
        }

        return quickSort(merge);

    }
}
