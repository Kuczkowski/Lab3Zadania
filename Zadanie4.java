package com.company;

public class Zadanie4 {
    public static int[][] zad4(){
        int a=3;
        int[][] z4 = new int[a][a];
        for (int i=0; i<a; i++)
        {
            for (int j=0; j<a; j++) {
                z4[i][j] = i+j;
            } }
        return z4;
    }


    public static void main(String[] args)
    {
        int[][] tab = zad4();
        for (int k=0; k<tab.length; k++)
        {
            for (int z=0; z<tab.length; z++)
            {
                System.out.print(tab[k][z]+" ");
            }
            System.out.println(" ");
        } } }