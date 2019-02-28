package com.bluetoothcontrol.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KeyScanner{
    public static int num2 = 2;
    public static int num1 = 1;
    public static void Keybord(){

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Here you declare your BufferedReader object and instance it.
        Scanner keyboard = new Scanner(System.in);
         int menu = keyboard.nextInt();
         //We read from user's input
        
         if (menu == num1){
            System.out.println("hello");
        } 
         if (menu == num2){
            System.out.println("tets");
         }
        }
        
    }