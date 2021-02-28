package com.company;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        {
            Scanner s= new Scanner(System.in);
            System.out.println("Podaj dlugosc tablicy:");
            int dlugosc = s.nextInt();
            String[]tab = new String[dlugosc];
            System.out.println("Podaj znaki:");

            Scanner dane=new Scanner(System.in);

            for(int i=0; i<dlugosc; i++)
                tab[i] = dane.next();

            for(int i=0; i<dlugosc; i++)
                System.out.println(tab[i]);
        } } }