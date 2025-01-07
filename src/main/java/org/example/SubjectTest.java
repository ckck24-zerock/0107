package org.example;

import java.util.Arrays;

public class SubjectTest {

    public static void main(String[] args) {

        Menu m1 = new Menu();
        m1.name = "간짜장";
        m1.price = 7900;
        m1.togo = false;

        System.out.println("M1");
        System.out.println(m1);

        Menu m2 = new Menu();
        m2.name = "짬뽕";
        m2.price = 7900;
        m2.togo = false;

        System.out.println("M2");
        System.out.println(m2);

        Menu m3 = new Menu();
        m3.name = "류산슬";
        m3.price = 7900;
        m3.togo = false;

        System.out.println("M3");
        System.out.println(m3);


        Menu[] menus = {m1, m2, m3};

        System.out.println(Arrays.toString(menus));




        SubjectScore s1 = new SubjectScore();
        s1.subject = "국어";
        s1.score = 30;

        SubjectScore s2 = new SubjectScore();
        s2.subject = "영어";
        s2.score = 40;

        SubjectScore s3 = new SubjectScore();
        s3.subject = "수학";
        s3.score = 20;

        SubjectScore[] arr = {s1,s2,s3};


    }
}
