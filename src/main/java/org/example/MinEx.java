package org.example;

public class MinEx {

    public static void main(String[] args) {

        int[] arr = {32,34,22,13,6,-3};

        int min = arr[0];
        int max = arr[0];

        for(int value: arr) {
            if(value < min) {
                min = value;
            }
            if(value > max){
                max = value;
            }
        }//for end

        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);

    }
}
