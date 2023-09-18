/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejprop19;

/**
 *
 * @author danie
 */
import javax.swing.*;

public class EJPROP19 extends JFrame {

    public EJPROP19() {
        // Create a new instance of your Formulario panel
        Formulario form = new Formulario();

        // Add the Formulario panel to the JFrame
        add(form);

        setTitle("Main Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Make the JFrame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                EJPROP19 mainForm = new EJPROP19();
            }
        });
    }
}
