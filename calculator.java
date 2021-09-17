package com.shreenath;

public class Main {

    public static void main(String[] args) {
    /*    int a = 100;
        while (a <= 200) {


            System.out.println(a);
            a++;
        }

        int [] marks = {12,3,4,32,3,4};
        System.out.println(marks[0]);*/
        int i ,j;
        int [][] books;
        books = new int  [2][3];
        books [0][0]= 1;

        books [0][1]=2;
        books [0][2]=3;
        books [1][0]=3;
        books [1][1]=4;
        books [1][2]=5;
        System.out.println(books);
        for(i=0;i<books.length;i++) {
            for (j = 0; j < books.length; j++) {

                System.out.println(books[i][j]);

            }
        }

    }
}
