package com.bluetoothcontrol.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KeyScanner{
    public static int num2 = 2;
    public static int num1 = 1;
    public static void Keybord() throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

    System.out.println("tets");
    //Here you declare your BufferedReader object and instance it.
    while (true){
         int menu = br.read();
         //We read from user's input
        
         if (menu == num1){
            System.out.println("hello");
        } 
         if (menu == num2){
            System.out.println("tets");
         }
        }
        
    }
}