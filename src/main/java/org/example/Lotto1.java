package org.example;

import java.util.Arrays;

public class Lotto1 {

    public static void main(String[] args) {

        //결과물을 담을 배열 선언
        int[] result = new int[6];

        //1 - 45 랜덤
        result[0] = (int)(Math.random() * 45) + 1;
        result[1] = (int)(Math.random() * 45) + 1;
        result[2] = (int)(Math.random() * 45) + 1;
        result[3] = (int)(Math.random() * 45) + 1;
        result[4] = (int)(Math.random() * 45) + 1;
        result[5] = (int)(Math.random() * 45) + 1;

        System.out.println(Arrays.toString(result));
    }
}
