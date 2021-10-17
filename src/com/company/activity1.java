package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class activity1 extends JFrame implements ActionListener {
    String nbraff ;
    Boolean on = false ;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JFrame frame;
    private JTextField txt1;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;

    private JButton btn0;
    private JButton a00Button;
    private JButton ENTER;
    private JButton CANCEL;
    private JButton CLEAR;
    private JButton OK;
    private JTextField txt2;

    activity1() {

        super("atm machine");
        this.setContentPane(this.panel1);
        this.setSize(420, 420);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        btn1 = new JButton();
        btn1.addActionListener(this);
txt1.addActionListener(this);
        btn1.setBounds(200, 100, 100, 50);

        btn1.setVisible(true);


        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btn0 = new JButton();
        ENTER = new JButton();
        CANCEL = new JButton();
        CLEAR = new JButton();
        OK = new JButton();
        txt1 = new JTextField();
        txt1.addActionListener(this);
        txt2 = new JTextField();
        panel1 = new JPanel();
        panel1 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel4.add(btn1);
        panel5 = new JPanel();





}

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==btn1){
    System.out.println("POO");
}
    }
}



