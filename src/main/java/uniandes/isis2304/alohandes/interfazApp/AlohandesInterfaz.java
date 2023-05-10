package uniandes.isis2304.alohandes.interfazApp;

import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
        JButton modificacion1 = new JButton("Deshabilitar alohamiento");
        modificacion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deshabilitarAloha();
            }
        });
        
        JButton modificacion2 = new JButton("Habilitar alohamiento");
        modificacion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                habilitarAloha();
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
        
        JButton consulta5 = new JButton("Análisis de operación");
        consulta5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                darAnalisis();
            }
        });
        
        JButton consulta6 = new JButton("Clientes frecuentes");
        consulta6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                darClientesFrecuentes();
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
            	resp.setText("");
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
            	resp.setText("");
            	resp.setText(pa.darUsoAlohandes(Long.parseLong(txtCliente.getText())));
            }
        });
    }

    private void deshabilitarAloha() {
    	JFrame ventana = new JFrame("Deshabilitar alohamiento");
    	ventana.setSize(800, 200);
    	ventana.setLocationRelativeTo(this);
    	ventana.setVisible(true);
        ventana.setLayout(new GridBagLayout());
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel cliente = new JLabel("Estado: ", SwingConstants.CENTER);
        JTextField txtCliente = new JTextField();
        JLabel uso = new JLabel("Id Alohamiento: ", SwingConstants.CENTER);
        JTextField txtAlohamiento = new JTextField();
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
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;
        ventana.add(txtAlohamiento, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;
        ventana.add(boton, constraints);
        
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Long idAlohamiento = Long.parseLong(txtCliente.getText());
                String estado = "";
            }
        });
    }

    private void habilitarAloha() {
    	JFrame ventana = new JFrame("Habilitar alohamiento");
    	ventana.setSize(800, 200);
    	ventana.setLocationRelativeTo(this);
    	ventana.setVisible(true);
        ventana.setLayout(new GridBagLayout());
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel cliente = new JLabel("Estado: ", SwingConstants.CENTER);
        JTextField txtCliente = new JTextField();
        JLabel uso = new JLabel("Id Alohamiento: ", SwingConstants.CENTER);
        JTextField txtAlohamiento = new JTextField();
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
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;
        ventana.add(txtAlohamiento, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;
        ventana.add(boton, constraints);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            }
        });
    }
    
    private void darAnalisis() {
    	JFrame ventana = new JFrame("Análisis de operación");
    	ventana.setSize(800, 800);
    	ventana.setLocationRelativeTo(this);
    	ventana.setVisible(true);
        ventana.setLayout(new GridBagLayout());
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        JLabel titulo = new JLabel("Análisis de operación", SwingConstants.CENTER);
        JLabel tiempo = new JLabel("Tiempo: ", SwingConstants.CENTER);
        String[] options = {"Mes", "Semana"};
        JComboBox<String> cbTiempo = new JComboBox<>(options);
        JLabel uso = new JLabel("Analisis: ", SwingConstants.CENTER);
        JTextArea resp = new JTextArea();
        resp.setEditable(false);
        JButton boton = new JButton("Consultar");   
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.ipady = 80;    
        ventana.add(titulo, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;    
        ventana.add(tiempo, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;
        ventana.add(cbTiempo, constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;
        ventana.add(boton, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        ventana.add(uso, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        ventana.add(resp, constraints);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int tiempo_resp;
                
                if(cbTiempo.getSelectedItem().equals("Mes")) {
            		tiempo_resp = 0;
            	}
            	else {
            		tiempo_resp = 1;
            	}
            	resp.setText("");
            	resp.setText(pa.analizarInformacion(tiempo_resp));
            }
        });
    }
    
    private void darClientesFrecuentes() {
    	JFrame ventana = new JFrame("Clientes frecuentes");
    	ventana.setSize(800, 800);
    	ventana.setLocationRelativeTo(this);
    	ventana.setVisible(true);
        ventana.setLayout(new GridBagLayout());
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        JLabel titulo = new JLabel("Clientes frecuentes", SwingConstants.CENTER);
        JLabel alojamiento = new JLabel("Alojamiento: ", SwingConstants.CENTER);
        String[] options = {"Apartamento", "Habitación compartida", "Habitación vivienda", "Hotel", "Vivienda por día", "Vivienda por semestre"};
        JComboBox<String> cbTiempo = new JComboBox<>(options);
        JLabel cliente = new JLabel("ID Cliente: ", SwingConstants.CENTER);
        JTextField txtCliente = new JTextField();
        JLabel clientes = new JLabel("Clientes: ", SwingConstants.CENTER);
        JTextArea resp = new JTextArea();
        resp.setEditable(false);
        JButton boton = new JButton("Consultar");   
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.ipady = 80;    
        ventana.add(titulo, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;    
        ventana.add(alojamiento, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;
        ventana.add(cbTiempo, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;    
        ventana.add(cliente, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;
        ventana.add(txtCliente, constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.ipady = 80;
        ventana.add(boton, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        ventana.add(clientes, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        ventana.add(resp, constraints);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String tipo = "";
            	Long id = Long.parseLong(txtCliente.getText());
                
                if(cbTiempo.getSelectedItem().equals("Apartamento")) {
                	tipo = "idapartamento";
            	}
            	else if (cbTiempo.getSelectedItem().equals("Habitación compartida")) {
            		tipo = "idhabitacioncompartida";
            	}
            	else if (cbTiempo.getSelectedItem().equals("Habitación vivienda")) {
            		tipo = "idhabitacionvivienda";
            	}
            	else if (cbTiempo.getSelectedItem().equals("Hotel")) {
            		tipo = "idhotel";
            	}
            	else if (cbTiempo.getSelectedItem().equals("Vivienda por día")) {
            		tipo = "idviviendapordia";
            	}
            	else if (cbTiempo.getSelectedItem().equals("Vivienda por semestre")) {
            		tipo = "idviviendaporsemestre";
            	}
            	resp.setText("");
            	resp.setText(pa.darClientesFrecuentes(tipo, id));
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
