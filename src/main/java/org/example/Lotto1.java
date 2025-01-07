package org.example;

import java.util.Arrays;

public class Lotto1 {

    public static void main(String[] args) {

        //결과물을 담을 배열 선언
        int[] result = new int[6];

        for (int i = 0; i < 6; i++) {

            int temp = (int)(Math.random() * 45) + 1;

            //result배열안에 temp가 있는지 체크하는 로직을 구성

            result[i] = temp;
        }
        //1 - 45 랜덤

        System.out.println(Arrays.toString(result));
    }
}
