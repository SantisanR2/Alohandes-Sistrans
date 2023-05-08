package uniandes.isis2304.alohandes.interfazApp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import uniandes.isis2304.alohandes.persistencia.PersistenciaAlohandes;

public class AlohandesInterfaz extends JFrame{
	
	private PersistenciaAlohandes pa;
	
	public AlohandesInterfaz() {
        // Configuración de la ventana principal
        setTitle("Interfaz Básica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2)); // Dos columnas

        // Creación de los botones
        for (int i = 1; i <= 18; i++) {
            JButton button = new JButton("Botón " + i);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    abrirNuevaVentana();
                }
            });
            add(button);
        }

        // Mostrar la ventana
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void abrirNuevaVentana() {
        JFrame ventanaNueva = new JFrame("Ventana Nueva");
        ventanaNueva.setSize(300, 200);
        ventanaNueva.setLocationRelativeTo(this);
        ventanaNueva.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AlohandesInterfaz();
            }
        });
    }

}
