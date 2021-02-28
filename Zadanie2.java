package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Zadanie2 {
    public static int[] tabela() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Witaj");
        int dn = 1;
        System.out.println ( "Wielkosc tablicy: " );
        int wielkosc;
        wielkosc = scan.nextInt();
        System.out.println( "Wpisz dowolna liczbe: " );
        int liczba;
        liczba=scan.nextInt();
        int[] tab=new int[wielkosc];
        tab[0] = liczba;
        while ( dn<wielkosc )
        {
            for ( int D=1;D<Math.pow(wielkosc,2); D++) {

                if (( D>liczba )&&( D>tab [dn-1] )&&(D %2==0)) {
                    tab[dn] = D;
                    dn++;
                    break;
                } } }
        return tab;
    }

    public static int Min(int[] tab) {
        int Min=tab[0];

        for ( int Mn:tab )

        {
            if (Mn<Min )

            {
                Min=Mn;
            } }
        return Min;
    }

    public static int max(int[] tab) {
        int max=tab[0];
        for (int O:tab )
        {
            if (O>max )
            {
               max=O;
            } }
    return max;
    }

    public static int suma(int[] tab) {
        int wynik = 0;
        for (int sm:tab )

        {
            wynik+=sm;
        }
        return wynik;
    }

    public static double srednia(int[] tab) {
        double wynik=0;

        for (double W:tab)

        {

            wynik+=W;
        }
        return wynik / tab.length;
    }

    public static double mediana(int[] tab) {
        Arrays.sort(tab);
        int mediana;
        if (tab.length %2==0)

        {

            int md1 = tab[(tab.length/2)-1], md2 = tab [( tab.length / 2 )];
            mediana=(md1+md2)/2;
        }
        else
        {
            mediana=tab [( tab.length / 2)];
        }
        return mediana;
    }

    public static void main(String[] args) {
        int[] tab=tabela();

        System.out.println("Tablica:"+Arrays.toString(tab));
        System.out.println("Minimalna wartosc w tablicy: "+Min(tab));
        System.out.println("Maksymalna wartosc w tablicy: "+max (tab));
        System.out.println("Suma liczba tablicy: "+suma (tab));
        System.out.println("Srednia wartosc liczb w tablicy: "+srednia (tab));
        System.out.println("Mediana liczb w tablicy: "+mediana (tab));
    } }