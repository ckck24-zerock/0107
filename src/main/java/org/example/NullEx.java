package org.example;

public class NullEx {

    public static void main(String[] args) {

        int[] arr = new int[3];
        int[] arr2 = arr;

        arr2 = null;
        arr = null;

    }
}
