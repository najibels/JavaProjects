package com.example.DreamsMlk;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.*;

public class Main2 {
    public static void main(String[] args) {

        JButton testButton1 = new JButton("Click to call Anonymous ActionListener");
        JButton testButton2 = new JButton("Click to call Lambda ActionListener");

        // Anonymous ActionListener
        testButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Click Detected by Anonymous Listener: " + e);
            }
        });

        // Lambda ActionListener
        testButton2.addActionListener(e -> System.out.println("Click Detected by Lambda Listner: " + e));

        // Swing stuff
        JFrame frame = new JFrame("Listener Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(testButton1, BorderLayout.WEST);
        frame.add(testButton2, BorderLayout.EAST);
        frame.pack();
        frame.setVisible(true);
    }
}
