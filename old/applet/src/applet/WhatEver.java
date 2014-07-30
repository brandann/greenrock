/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class WhatEver extends JApplet implements ActionListener 
{ 
    @Override
    public void init() { //initiallize the applet 
        getContentPane().add(label1, BorderLayout.NORTH); 
        pane1.setLayout(new GridLayout(1,2)); 
        pane1.add(but1); 
        pane1.add(but2); 
        getContentPane().add(pane1, BorderLayout.SOUTH); 
        but1.addActionListener(this); 
        but2.addActionListener(this); 
    } 

    @Override
    public void actionPerformed(ActionEvent event) { 
        Object source = event.getSource(); 
        if(source == but1) {
            label1.setVisible(true);
        } 
        else {
            label1.setVisible(false);
        }
    } 
    

    private JLabel label1 = new JLabel("Hello Java Swing World\nHa!"); 
    private JPanel pane1 = new JPanel(); 
    private JButton but1 = new JButton("ON"); 
    private JButton but2 = new JButton ("OFF"); 
} 