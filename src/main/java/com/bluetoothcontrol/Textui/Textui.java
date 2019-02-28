package com.bluetoothcontrol.Textui;
import jexer.*;
import jexer.TApplication.BackendType;

public class Textui extends TApplication{

        public Textui() throws Exception {
            super(BackendType.SWING); // Could also use BackendType.XTERM

            // Create standard menus for File and Window
            addFileMenu();
            addWindowMenu();

            // Add a custom window, see below for its code.  The TWindow
            // constructor will add it to this application.
            new Textuiwindow(this);
        }

        public static void main(String [] args) throws Exception {
            Textui app = new Textui();
            (new Thread(app)).start();
        }
    }
