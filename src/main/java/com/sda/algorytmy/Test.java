package com.sda.algorytmy;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        Random random = new Random();

        int[] tablica = new int[10000];
        long startTime;
        long endTime;
        long totalTime;

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(10000 + 1) - 5000;
        }



        //Sortowanie bąbelkowe
        startTime = System.currentTimeMillis();
        for(int i = 0; i < tablica.length - 1; i++){
            boolean straznik = false;
            int temp = 0;
            for (int j = 0; j < tablica.length - i - 1; j++){ //Zmniejszanie zakresu iteracji o 1 po kazdym przebiegu petli
                if (tablica[i] > tablica[i + 1]) {
                    temp = tablica[i + 1];
                    tablica[i + 1] = tablica[i];
                    tablica[i] = temp;
                    straznik = true;
                }
            }
            if(!straznik){
                break;
            }

        }
        endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(tablica));
        System.out.println("Czas sortowania bubbleSort: " + (endTime - startTime));
        System.out.println();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(10000 + 1) - 5000;
        }


        startTime = System.currentTimeMillis();
        //quickSort(tablica);
        System.out.println(Arrays.toString(quickSort(tablica)));
        endTime = System.currentTimeMillis();
        System.out.println("Czas sortowania quickSort: " + (endTime - startTime));



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
        int i = 0;
        int[] wieksze = new int[ileWiekszych];
        for (int el : tablica){
            if (el > pivot){
                wieksze[i] = el;
                i++;
            }
        }
        // Zapelnienie tablicy mniejszych
        int j = 0;
        int[] mniejsze = new int[ileMniejszych];
        for (int el : tablica){
            if (el < pivot){
                mniejsze[j] = el;
                j++;
            }
        }
        // Zlozenie tablic  + rekurencyjne sortowanie Wieksze/Mniejsze
        int[] merge = new int[tablica.length];
        System.arraycopy(quickSort(mniejsze), 0, merge, 0, mniejsze.length);
        merge[mniejsze.length] = pivot;
        System.arraycopy(quickSort(wieksze), 0, merge, mniejsze.length + 1, wieksze.length);

        return merge;
    }
}



