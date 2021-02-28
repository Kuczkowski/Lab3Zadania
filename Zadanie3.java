package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Zadanie3 {
    public static int[] Zadanie3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dlugosc tablicy");
        int dlugosc = scan.nextInt();
        int[] tab0 = new int[dlugosc];
        int[] tab1 = new int[dlugosc];
        int[] tab2 = new int[dlugosc];
        for (int i=0;i<dlugosc;i++) {
            System.out.println("Podaj liczby to pierwszej tablicy:");
            tab0[i] = scan.nextInt();
        }

        for (int i=0;i<dlugosc;i++) {
            System.out.println("Podaj liczby do drugiej tablicy:");
            tab1[i] = scan.nextInt();
        }

        for (int i=0;i<dlugosc;i++) {

            tab2[i]=tab0[i]+tab1[i];
        }
        return tab2;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Zadanie3()));
    }}