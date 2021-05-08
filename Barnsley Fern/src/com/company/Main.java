package com.company;

import fern.Fern;

import javax.swing.*;

import static javax.swing.SwingUtilities.invokeLater;

public class Main {
    private static void initUI() {
        JFrame f = new JFrame("Barnsley Fern");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Fern());
        f.setSize(1000, 1000);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        invokeLater(Main::initUI);
    }
}