/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applettest;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author brandan
 */
public class AppletTest extends JApplet implements ActionListener{

    public void init()
    {
        JButton button = new JButton("HA!");
        button.addActionListener(this);
        getContentPane().add(button);
        this.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String title = "Greetings";
        String message = "Hello from the swing user interface library.";
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
}
