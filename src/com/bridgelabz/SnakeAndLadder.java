package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args){
        int start = 0;
        System.out.println("Welcome to Snake And Ladder Game");
        System.out.println("Start position = "+start);
        int roll = (int) (Math.floor(Math.random() *10)%6+1);
        System.out.println("After rolling the dice : "+ roll);
    }
}