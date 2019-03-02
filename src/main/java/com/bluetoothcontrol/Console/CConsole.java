package com.bluetoothcontrol.Console;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
//from   ww  w .jav  a2  s . c  o m
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CConsole extends JFrame {/*
  public static void main(String[] args) {
    Console console = new Console();
    console.init();
    CConsole launcher = new CConsole();
    launcher.setVisible(true);
    console.getFrame().setLocation(
        launcher.getX() + launcher.getWidth() + launcher.getInsets().right,
        launcher.getY());
  }

  private CConsole() {
    super();
    setSize(600, 600);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}

class Console {
  final JFrame frame = new JFrame();
  public Console() {
    JTextArea textArea = new JTextArea(24, 80);
    textArea.setBackground(Color.BLACK);
    textArea.setForeground(Color.GREEN);
    textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
    System.setOut(new PrintStream(new OutputStream() {
      @Override
      public void write(int b) throws IOException {
        textArea.append(String.valueOf((char) b));
      }
    }));
    frame.add(textArea);
  }
  public void init() {
    frame.pack();
    frame.setVisible(true);
  }
  public JFrame getFrame() {
    return frame;
    */
}

