package com.kodluyoruz.springegitim.altinciHafta.exceptions;

public class UncheckedException {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length());

        int b = 15/0;

        String s1 = "a12";
        int i = Integer.parseInt(s1);

        int[] array = {10,20,30,40};
        int i1 = array[4];

    }
}
