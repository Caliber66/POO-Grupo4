package com.mycompany.ejerciciores7;

import javax.swing.*;

public class EJERCICIORES7 {
    public static void main(String[] args) {
        // Crear una ventana de diálogo para ingresar los valores de A y B
        String inputA = JOptionPane.showInputDialog("Ingrese el valor de A:");
        String inputB = JOptionPane.showInputDialog("Ingrese el valor de B:");

        // Convertir las entradas a números enteros
        int A = Integer.parseInt(inputA);
        int B = Integer.parseInt(inputB);

        // Comparar A y B y mostrar el mensaje correspondiente en una ventana de diálogo
        if (A > B) {
            JOptionPane.showMessageDialog(null, "A es mayor que B");
        } else if (A == B) {
            JOptionPane.showMessageDialog(null, "A es igual a B");
        } else {
            JOptionPane.showMessageDialog(null, "A es menor que B");
        }
    }
}
