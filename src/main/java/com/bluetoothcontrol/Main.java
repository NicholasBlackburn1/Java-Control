package com.bluetoothcontrol;

import java.awt.Window;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Timer;

import javax.swing.plaf.TextUI;

import com.bluetoothcontrol.Textui.Textui;
import com.bluetoothcontrol.clidata.pos;
import com.bluetoothcontrol.client.Mqttclient;
import com.bluetoothcontrol.client.Tcpclient;
import com.bluetoothcontrol.server.BluetoothServer;
import com.bluetoothcontrol.server.Tcpserver;

public class Main {
    // reads user input to do an action from a number list 
    public static void main(String[] args) throws NoSuchElementException {
        Scanner keyboard = new Scanner(System.in);
        int myint = keyboard.nextInt();
         System.out.println("enter an integer"); 
         
         if(myint == 1){
             System.out.println("hello");
         }

    }
}
