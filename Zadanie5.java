package com.company;

public class Zadanie5 {
    public static int zad5(){
        int a=2218;
        int b=2802;
        while (a!=b) {

            if (a>b) {

                a-=b;
            }
            else {

                b-=a;
            } }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Najwiekszt wspolny dzielnik to: " +zad5());
    } }