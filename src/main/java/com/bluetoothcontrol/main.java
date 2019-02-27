package com.bluetoothcontrol;

import java.awt.Window;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.TextUI;

import com.bluetoothcontrol.Textui.Textui;
import com.bluetoothcontrol.client.Mqttclient;
import com.bluetoothcontrol.client.Tcpclient;
import com.bluetoothcontrol.server.BluetoothServer;
import com.bluetoothcontrol.server.Tcpserver;

public class main {
    public static void main(String[] args) throws IOException {
      
      
        int menu ;
        Scanner input = new Scanner(System.in);
        System.out.println("to run clinet press 1 to run server press 2"+input.nextInt());
    
        System.out.print(input);
       
    }
}
