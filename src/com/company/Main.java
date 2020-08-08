package com.company;

import java.awt.Component;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        com.company.WindowEngine windowEngine = new com.company.WindowEngine();
        windowEngine.setDefaultCloseOperation(3);
        windowEngine.setLocationRelativeTo((Component)null);
        windowEngine.setVisible(true);
        windowEngine.setSize(580, 235);
        windowEngine.setResizable(false);
    }
}