package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class theArrays {
    public static void main(String[] args) {


        char[][] board = new char[][]{
                new char[] {'-','-','-'},
                new char[] {'-','-','-'},
                new char[] {'-','-','-'}
        };

//        for (int i=0; i<3;i++){
//            for(int j=0;j<3;j++){
//                board[i][j]='h';
//            }
//        }

        System.out.println(Arrays.deepToString(board));

    }
}
