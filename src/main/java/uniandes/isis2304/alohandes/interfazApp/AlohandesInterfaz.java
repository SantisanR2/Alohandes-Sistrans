package uniandes.isis2304.alohandes.interfazApp;

import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import uniandes.isis2304.alohandes.persistencia.PersistenciaAlohandes;

public class AlohandesInterfaz extends JFrame{

	private PersistenciaAlohandes pa;

	public AlohandesInterfaz() {
		pa = new PersistenciaAlohandes();
		
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
        
        JButton consulta1 = new JButton("Dinero por año");
        consulta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	darDineroPorAnhio();
            }
        });
        
        JButton consulta2 = new JButton("Ofertas mas populares");
        consulta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	darOfertasMasPopulares();
            }
        });
        
        JButton consulta3 = new JButton("Indice de ocupación");
        consulta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	darIndiceOcupacion();
            }
        });
        
        JButton consulta4 = new JButton("Uso Alohandes");
        consulta4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	darUsoAlohandes();
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
    
    private void darDineroPorAnhio() {
    	JFrame ventana = new JFrame("Dinero por año");
    	ventana.setSize(800, 200);
    	ventana.setLocationRelativeTo(this);
    	ventana.setVisible(true);
        ventana.setLayout(new GridLayout(2, 3));
        JLabel anhio = new JLabel("Año: ", SwingConstants.CENTER);
        JTextField txtAnhio = new JTextField();
        JLabel dinero = new JLabel("Dinero: ", SwingConstants.CENTER);
        JTextArea resp = new JTextArea();
        resp.setEditable(false);
        JButton boton = new JButton("Consultar");      
        ventana.add(anhio);
        ventana.add(txtAnhio);
        ventana.add(boton);
        ventana.add(dinero);
        ventana.add(resp);   
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	resp.setText(pa.darDineroRecibido(Integer.parseInt(txtAnhio.getText())));
            }
        });
    }
    
    private void darOfertasMasPopulares() {
    	JFrame ventana = new JFrame("Ofertas populares");
    	ventana.setSize(350, 600);
    	ventana.setLocationRelativeTo(this);
    	ventana.setVisible(true);
        ventana.setLayout(new GridBagLayout());
        JLabel titulo = new JLabel("20 Ofertas más populares", SwingConstants.CENTER);
        JTextArea resp = new JTextArea();
        resp.setEditable(false);
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 50;        
        ventana.add(titulo, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 30;
        resp.setText(pa.dar20MasPopulares());
        ventana.add(resp, constraints);
    }
    
    private void darIndiceOcupacion() {
    	JFrame ventana = new JFrame("Índice ocupación");
    	ventana.setSize(350, 600);
    	ventana.setLocationRelativeTo(this);
    	ventana.setVisible(true);
        ventana.setLayout(new GridBagLayout());
        JLabel titulo = new JLabel("Índice ocupación", SwingConstants.CENTER);
        JTextArea resp = new JTextArea();
        resp.setEditable(false);
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 50;        
        ventana.add(titulo, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 30;
        resp.setText(pa.darIndiceOcupacion());
        ventana.add(resp, constraints);
    }
    
    private void darUsoAlohandes() {
    	JFrame ventana = new JFrame("Uso Alohandes");
    	ventana.setSize(800, 200);
    	ventana.setLocationRelativeTo(this);
    	ventana.setVisible(true);
        ventana.setLayout(new GridBagLayout());
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel cliente = new JLabel("ID Cliente: ", SwingConstants.CENTER);
        JTextField txtCliente = new JTextField();
        JLabel uso = new JLabel("Uso: ", SwingConstants.CENTER);
        JTextArea resp = new JTextArea();
        resp.setEditable(false);
        JButton boton = new JButton("Consultar");   
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;    
        ventana.add(cliente, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;
        ventana.add(txtCliente, constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;
        ventana.add(boton, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        ventana.add(uso, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        ventana.add(resp, constraints);   
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	resp.setText(pa.darUsoAlohandes(Long.parseLong(txtCliente.getText())));
            }
        });
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
