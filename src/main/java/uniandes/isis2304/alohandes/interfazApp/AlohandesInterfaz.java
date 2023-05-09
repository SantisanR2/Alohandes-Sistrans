package uniandes.isis2304.alohandes.interfazApp;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import uniandes.isis2304.alohandes.persistencia.PersistenciaAlohandes;

public class AlohandesInterfaz extends JFrame{

	private PersistenciaAlohandes pa;

	public AlohandesInterfaz() {
        // Configuración de la ventana principal
        setTitle("Alohandes");
        setSize(500, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2)); // Dos columnas

        JLabel modificacion = new JLabel("Modificación", SwingConstants.CENTER);
        JLabel consulta =  new JLabel("Consulta", SwingConstants.CENTER);
        
        // Creación de los botones
        JButton modificacion1 = new JButton("Mod 1");
        modificacion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton modificacion2 = new JButton("Mod 2");
        modificacion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton modificacion3 = new JButton("Mod 3");
        modificacion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton modificacion4 = new JButton("Mod 4");
        modificacion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton modificacion5 = new JButton("Mod 5");
        modificacion5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton modificacion6 = new JButton("Mod 6");
        modificacion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton modificacion7 = new JButton("Mod 7");
        modificacion7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton modificacion8 = new JButton("Mod 8");
        modificacion8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton modificacion9 = new JButton("Mod 9");
        modificacion9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        //LABEL
        
        JButton consulta1 = new JButton("Consulta 1");
        consulta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton consulta2 = new JButton("Consulta 2");
        consulta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton consulta3 = new JButton("Consulta 3");
        consulta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton consulta4 = new JButton("Consulta 4");
        consulta4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton consulta5 = new JButton("Consulta 5");
        consulta5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton consulta6 = new JButton("Consulta 6");
        consulta6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton consulta7 = new JButton("Consulta 7");
        consulta7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton consulta8 = new JButton("Consulta 8");
        consulta8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        JButton consulta9 = new JButton("Consulta 9");
        consulta9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirNuevaVentana();
            }
        });
        
        add(modificacion);
        add(consulta);
        add(modificacion1);
        add(consulta1);
        add(modificacion2);
        add(consulta2);
        add(modificacion3);
        add(consulta3);
        add(modificacion4);
        add(consulta4);
        add(modificacion5);
        add(consulta5);
        add(modificacion6);
        add(consulta6);
        add(modificacion7);
        add(consulta7);
        add(modificacion8);
        add(consulta8);
        add(modificacion9);
        add(consulta9);
        

        // Mostrar la ventana
        //pack();
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
