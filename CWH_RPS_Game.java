package com.company;
import java.util.Scanner;
import java.util.Random;

public class CWH_RPS_Game {



        public static void main(String[] args) {
                byte m1;
                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to Rock, Paper and S game");
                System.out.println("There will be 3 Rounds of game : ");
                int ff=2;
                while(ff==2){
                        System.out.println("To Play the Game Type 1 and to end the Game Type Anything else");
                        int flag=sc.nextInt();
                        if(flag==1){
                                int game=3;
                                int computer=0,player=0,draw=0;
                                while(game>0){
                                        game--;
                                        Random r = new Random();
                                        int comp = r.nextInt() % 3;
                                        System.out.println("Enter 0 for Rock , 1 for Paper and 2 for Sissor");
                                        int f=sc.nextInt();
                                        if(f==0){
                                                if(comp==0) {
                                                        System.out.println("Its a Draw !!, Next Round Begins");
                                                        draw++;
                                                }
                                                else if( comp==1){
                                                        System.out.println("You Lose !!, Next Round Begins");
                                                        computer++;
                                                }
                                                else{
                                                        System.out.println("You Won !!, Next Round Begins");
                                                        player++;
                                                }
                                        }
                                        else if(f==1){
                                                if(comp==0) {
                                                        System.out.println("You Won !!, Next Round Begins");
                                                        player++;
                                                }
                                                else if( comp==1){
                                                        System.out.println("Its a Draw !!, Next Round Begins");
                                                        computer++;
                                                        draw++;
                                                }
                                                else{
                                                        System.out.println("You lose !!, Next Round Begins");
                                                        computer++;
                                                }
                                        }
                                        else {
                                                if(comp==0) {
                                                        System.out.println("You lose !!, Next Round Begins");
                                                        computer++;
                                                }
                                                else if( comp==1){
                                                        System.out.println("You Won !!, Next Round Begins");
                                                        player++;
                                                }
                                                else{
                                                        System.out.println("Its a Draw !!, Next Round Begins");
                                                        draw++;
                                                }
                                        }
                                }
                                System.out.printf("No of Games You Won %d ,No of Games You Lose %d and No of Games Drawed is %d",player,computer,draw);
                                System.out.println();
                                if(player==computer){
                                        System.out.println("The Whole Game is a DRAW !!");
                                }
                                else if(player>computer){
                                        System.out.println("You Won The Whole Game");
                                }
                                else{
                                        System.out.println("You Lost The Game");
                                }
                        }
                        else{
                                break;
                        }

                }
        }
}
