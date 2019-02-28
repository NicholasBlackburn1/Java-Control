package com.bluetoothcontrol;

import java.awt.Window;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
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
    public static void main(String[] args){
     @SuppressWarnings("resource")

    Scanner ss = new Scanner(System.in);
    System.out.print("Enter the your Name : ");
    // Below Statement used for getting String including sentence
    int s = ss.nextInt();

    System.out.println(s);
    }
}
