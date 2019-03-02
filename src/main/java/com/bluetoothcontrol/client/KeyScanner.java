package com.bluetoothcontrol.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KeyScanner{
    public static int num2 = 2;
    public static int num1 ;
    public static int num0;
    public static void Keybord() throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter something > ");
        System.out.print("You entered : ");
       
    while (input.hasNext()){
         num1 =input.nextInt(num1);
       }
       

        System.out.println(num1);


    }
}