package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Reader calc = new Reader("Calculator");
        calc.setVisible(true);
        calc.setResizable(false);
        calc.setLocationRelativeTo(null);
        calc.getContentPane().setBackground(new Color(255,250,221));
        calc.setFont(new Font("MV Boli", Font.PLAIN,20));
    }

}