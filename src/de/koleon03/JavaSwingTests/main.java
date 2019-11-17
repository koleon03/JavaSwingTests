package de.koleon03.JavaSwingTests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    private static JFrame mainFrame = new JFrame("main");
    private static JPanel numberPad = new JPanel();
    private static JPanel zeroP = new JPanel();
    private static JPanel numbersA = new JPanel();

    public static void main(String[] args) {
        mainFrame.setLayout(new GridLayout(2, 1));
        numberPad.setLayout(new GridLayout(3, 3));
        zeroP.setLayout(new GridLayout(1, 2));
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 600);
        numbersA.setLayout(new GridLayout(2, 1));
        numbersA.add(numberPad);
        numbersA.add(zeroP);
        mainFrame.add(numbersA);
        numbers();


    }

    public static void numbers() {
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        numberPad.add(one);
        numberPad.add(two);
        numberPad.add(three);
        numberPad.add(four);
        numberPad.add(five);
        numberPad.add(six);
        numberPad.add(seven);
        numberPad.add(eight);
        numberPad.add(nine);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("3");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("6");
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("9");
            }
        });
        JButton zero = new JButton("0");
        JButton point = new JButton(".");
        zeroP.add(zero);
        zeroP.add(point);
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("0");
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(".");
            }
        });

    }


}
