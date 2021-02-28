package com.company;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Dlugosc tablicy:");
            int dlugosc;
            dlugosc=scan.nextInt();
            int[] tab0=new int[dlugosc];
            int [] tab1=new int[dlugosc];
            int[] tab2=new int[dlugosc];
            for (int i = 0; i<dlugosc; i++) {
                System.out.println("Liczba do pierwszej tabeli: ");
                tab0[i] = scan.nextInt();
            }
            for (int i = 0; i<dlugosc; i++) {
                System.out.println("Liczba do drugiej tabeli:");
                tab1[i] = scan.nextInt();
            }
            for (int i = 0; i<dlugosc; i++) {

                tab2[i] = tab0[i] + tab1[i];
            }
            System.out.println(tab2);
        } } }

