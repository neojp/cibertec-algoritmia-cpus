package final_project;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Modificar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblFabricante;
	private JTextField txtFabricante;
	private JLabel lblSerie;
	private JTextField txtSerie;
	private JLabel lblNucleos;
	private JTextField txtNucleos;
	private JLabel lblHilos;
	private JTextField txtHilos;
	private JLabel lblVelNucleos;
	private JTextField txtVelNucleos;
	private JTextField txtGraficosIntegrados;
	private JLabel lblGraficosIntegrados;
	private JButton btnCancelar;
	private JComboBox<String> cboModelo;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificar dialog = new Modificar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Modificar() {
		setTitle("Modificar");
		setBounds(100, 100, 450, 321);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblModelo.setBounds(10, 10, 134, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrecio.setBounds(10, 39, 134, 14);
		getContentPane().add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(154, 36, 270, 20);
		getContentPane().add(txtPrecio);
		
		lblFabricante = new JLabel("Fabricante");
		lblFabricante.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFabricante.setBounds(10, 67, 134, 14);
		getContentPane().add(lblFabricante);
		
		txtFabricante = new JTextField();
		txtFabricante.setColumns(10);
		txtFabricante.setBounds(154, 64, 270, 20);
		getContentPane().add(txtFabricante);
		
		lblSerie = new JLabel("Serie");
		lblSerie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSerie.setBounds(10, 95, 134, 14);
		getContentPane().add(lblSerie);
		
		txtSerie = new JTextField();
		txtSerie.setColumns(10);
		txtSerie.setBounds(154, 92, 270, 20);
		getContentPane().add(txtSerie);
		
		lblNucleos = new JLabel("Nucleos");
		lblNucleos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNucleos.setBounds(10, 123, 134, 14);
		getContentPane().add(lblNucleos);
		
		txtNucleos = new JTextField();
		txtNucleos.setColumns(10);
		txtNucleos.setBounds(154, 120, 270, 20);
		getContentPane().add(txtNucleos);
		
		lblHilos = new JLabel("Hilos");
		lblHilos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHilos.setBounds(10, 151, 134, 14);
		getContentPane().add(lblHilos);
		
		txtHilos = new JTextField();
		txtHilos.setColumns(10);
		txtHilos.setBounds(154, 148, 270, 20);
		getContentPane().add(txtHilos);
		
		lblVelNucleos = new JLabel("Velocidad de Nucleos");
		lblVelNucleos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVelNucleos.setBounds(10, 179, 134, 14);
		getContentPane().add(lblVelNucleos);
		
		txtVelNucleos = new JTextField();
		txtVelNucleos.setColumns(10);
		txtVelNucleos.setBounds(154, 176, 270, 20);
		getContentPane().add(txtVelNucleos);
		
		txtGraficosIntegrados = new JTextField();
		txtGraficosIntegrados.setColumns(10);
		txtGraficosIntegrados.setBounds(154, 204, 270, 20);
		getContentPane().add(txtGraficosIntegrados);
		
		lblGraficosIntegrados = new JLabel("Graficos Integrados");
		lblGraficosIntegrados.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGraficosIntegrados.setBounds(10, 206, 134, 17);
		getContentPane().add(lblGraficosIntegrados);
		
		btnCancelar = new JButton("CERRAR");
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setBackground(new Color(128, 64, 64));
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBounds(10, 235, 197, 41);
		getContentPane().add(btnCancelar);
		
		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.setBounds(154, 6, 270, 22);
		cboModelo.addItem(Principal.modelo1);
		cboModelo.addItem(Principal.modelo2);
		cboModelo.addItem(Principal.modelo3);
		cboModelo.addItem(Principal.modelo4);
		cboModelo.addItem(Principal.modelo5);
		cboModelo.addItem(Principal.modelo6);
		cboModelo.addItem(Principal.modelo7);
		cboModelo.addItem(Principal.modelo8);
		cboModelo.addItem(Principal.modelo9);
		cboModelo.addItem(Principal.modelo10);
		getContentPane().add(cboModelo);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(this);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGuardar.setBackground(new Color(0, 64, 128));
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBounds(227, 235, 197, 41);
		getContentPane().add(btnGuardar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo1(e);
		}
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancel(e);
		}
	}
	protected void actionPerformedBtnCancel(ActionEvent e) {
		dispose();
	}
	
	
	
		// 1. obtener los valores de todos los campos
	protected void actionPerformedCboModelo1(ActionEvent e) {

	    int index = cboModelo.getSelectedIndex();

	    switch (index) {
	    case 0: 
			txtFabricante.setText(Principal.fabricante1);
			txtGraficosIntegrados.setText(Principal.formatVideo(Principal.video1));
			txtHilos.setText(String.valueOf(Principal.hilos1));
			txtNucleos.setText(String.valueOf(Principal.nucleos1));
			txtPrecio.setText(Principal.formatPrecio(Principal.precio1));
			txtSerie.setText(Principal.series1);
			txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad1));
		break;
		case 1: 
			txtFabricante.setText(Principal.fabricante2);
			txtGraficosIntegrados.setText(Principal.formatVideo(Principal.video2));
			txtHilos.setText(String.valueOf(Principal.hilos2));
			txtNucleos.setText(String.valueOf(Principal.nucleos2));
			txtPrecio.setText(Principal.formatPrecio(Principal.precio2));
			txtSerie.setText(Principal.series2);
			txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad2));
		break;
		case 2: 
			txtFabricante.setText(Principal.fabricante3);
			txtGraficosIntegrados.setText(Principal.formatVideo(Principal.video3));
			txtHilos.setText(String.valueOf(Principal.hilos3));
			txtNucleos.setText(String.valueOf(Principal.nucleos3));
			txtPrecio.setText(Principal.formatPrecio(Principal.precio3));
			txtSerie.setText(Principal.series3);
			txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad3));
		break;
		case 3: 
			txtFabricante.setText(Principal.fabricante4);
			txtGraficosIntegrados.setText(Principal.formatVideo(Principal.video4));
			txtHilos.setText(String.valueOf(Principal.hilos4));
			txtNucleos.setText(String.valueOf(Principal.nucleos4));
			txtPrecio.setText(Principal.formatPrecio(Principal.precio4));
			txtSerie.setText(Principal.series4);
			txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad4));
		break;
		case 4: 
			txtFabricante.setText(Principal.fabricante5);
			txtGraficosIntegrados.setText(Principal.formatVideo(Principal.video5));
			txtHilos.setText(String.valueOf(Principal.hilos5));
			txtNucleos.setText(String.valueOf(Principal.nucleos5));
			txtPrecio.setText(Principal.formatPrecio(Principal.precio5));
			txtSerie.setText(Principal.series5);
			txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad5));
		break;
		case 5: 
			txtFabricante.setText(Principal.fabricante6);
			txtGraficosIntegrados.setText(Principal.formatVideo(Principal.video6));
			txtHilos.setText(String.valueOf(Principal.hilos6));
			txtNucleos.setText(String.valueOf(Principal.nucleos6));
			txtPrecio.setText("$"+ Principal.precio6);
			txtSerie.setText(Principal.series6);
			txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad6));
		break;
		case 6: 
			txtFabricante.setText(Principal.fabricante7);
			txtGraficosIntegrados.setText(Principal.formatVideo(Principal.video7));
			txtHilos.setText(String.valueOf(Principal.hilos7));
			txtNucleos.setText(String.valueOf(Principal.nucleos7));
			txtPrecio.setText("$"+ Principal.precio7);
			txtSerie.setText(Principal.series7);
			txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad7));
		break;
		case 7: 
			txtFabricante.setText(Principal.fabricante8);
			txtGraficosIntegrados.setText(Principal.formatVideo(Principal.video8));
			txtHilos.setText(String.valueOf(Principal.hilos8));
			txtNucleos.setText(String.valueOf(Principal.nucleos8));
			txtPrecio.setText("$"+ Principal.precio8);
			txtSerie.setText(Principal.series8);
			txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad8));
		break;
		case 8: 
			txtFabricante.setText(Principal.fabricante9);
			txtGraficosIntegrados.setText(Principal.formatVideo(Principal.video9));
			txtHilos.setText(String.valueOf(Principal.hilos9));
			txtNucleos.setText(String.valueOf(Principal.nucleos9));
			txtPrecio.setText("$"+ Principal.precio9);
			txtSerie.setText(Principal.series9);
			txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad9));
		break;
		default : 
			txtFabricante.setText(Principal.fabricante10);
			txtGraficosIntegrados.setText(Principal.formatVideo(Principal.video10));
			txtHilos.setText(String.valueOf(Principal.hilos10));
			txtNucleos.setText(String.valueOf(Principal.nucleos10));
			txtPrecio.setText("$"+ Principal.precio10);
			txtSerie.setText(Principal.series10);
			txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad10));
		break;

	    
	    }
	}
	protected void actionPerformedBtnGuardar(ActionEvent e) {

	    // 1. Validar campos vacíos
	    if (txtPrecio.getText().isEmpty() ||
	        txtFabricante.getText().isEmpty() ||
	        txtSerie.getText().isEmpty() ||
	        txtNucleos.getText().isEmpty() ||
	        txtHilos.getText().isEmpty() ||
	        txtVelNucleos.getText().isEmpty() ||
	        txtGraficosIntegrados.getText().isEmpty()) {

	        javax.swing.JOptionPane.showMessageDialog(this,
	                "Todos los campos son obligatorios");
	        return;
	    }

	    try {
	        // 2. Obtener valores
	        double precio = Double.parseDouble(txtPrecio.getText());
	        String fabricante = txtFabricante.getText();
	        String serie = txtSerie.getText();
	        int nucleos = Integer.parseInt(txtNucleos.getText());
	        int hilos = Integer.parseInt(txtHilos.getText());
	        double velocidad = Double.parseDouble(txtVelNucleos.getText());
	        char video = txtGraficosIntegrados.getText().toUpperCase().charAt(0);

	        // 3. Validar video (S o N)
	        if (video != '1' && video != '0') {
	            javax.swing.JOptionPane.showMessageDialog(this,
	                    "Graficos Integrados solo puede ser 1 o 0");
	            return;
	        }

	        // 4. Actualizar variables globales
	        int index = cboModelo.getSelectedIndex();

	        switch (index) {
	        case 0:
	            Principal.precio1 = precio;
	            Principal.fabricante1 = fabricante;
	            Principal.series1 = serie;
	            Principal.nucleos1 = nucleos;
	            Principal.hilos1 = hilos;
	            Principal.velocidad1 = velocidad;
	            Principal.video1 = video;
	            break;

	        case 1:
	            Principal.precio2 = precio;
	            Principal.fabricante2 = fabricante;
	            Principal.series2 = serie;
	            Principal.nucleos2 = nucleos;
	            Principal.hilos2 = hilos;
	            Principal.velocidad2 = velocidad;
	            Principal.video2 = video;
	            break;
	            
	        case 2:
	            Principal.precio3 = precio;
	            Principal.fabricante3 = fabricante;
	            Principal.series3 = serie;
	            Principal.nucleos3 = nucleos;
	            Principal.hilos3 = hilos;
	            Principal.velocidad3 = velocidad;
	            Principal.video3 = video;
	            break;
	            
	        case 3:
	            Principal.precio4 = precio;
	            Principal.fabricante4 = fabricante;
	            Principal.series4 = serie;
	            Principal.nucleos4 = nucleos;
	            Principal.hilos4 = hilos;
	            Principal.velocidad4 = velocidad;
	            Principal.video4 = video;
	            break;
	            
	        case 4:
	            Principal.precio5 = precio;
	            Principal.fabricante5 = fabricante;
	            Principal.series5 = serie;
	            Principal.nucleos5 = nucleos;
	            Principal.hilos5 = hilos;
	            Principal.velocidad5 = velocidad;
	            Principal.video5 = video;
	            break;   
	        
	        case 5:
	            Principal.precio6 = precio;
	            Principal.fabricante6 = fabricante;
	            Principal.series6 = serie;
	            Principal.nucleos6 = nucleos;
	            Principal.hilos6 = hilos;
	            Principal.velocidad6 = velocidad;
	            Principal.video6 = video;
	            break; 
	            
	        case 6:
	            Principal.precio7 = precio;
	            Principal.fabricante7 = fabricante;
	            Principal.series7 = serie;
	            Principal.nucleos7 = nucleos;
	            Principal.hilos7 = hilos;
	            Principal.velocidad7 = velocidad;
	            Principal.video7 = video;
	            break;
	            
	        case 7:
	            Principal.precio8 = precio;
	            Principal.fabricante8 = fabricante;
	            Principal.series8 = serie;
	            Principal.nucleos8 = nucleos;
	            Principal.hilos8 = hilos;
	            Principal.velocidad8 = velocidad;
	            Principal.video8 = video;
	            break;
	            
	        case 8:
	            Principal.precio9 = precio;
	            Principal.fabricante9 = fabricante;
	            Principal.series9 = serie;
	            Principal.nucleos9 = nucleos;
	            Principal.hilos9 = hilos;
	            Principal.velocidad9 = velocidad;
	            Principal.video9 = video;
	            break;
	            
	        default:
	            Principal.precio10 = precio;
	            Principal.fabricante10 = fabricante;
	            Principal.series10 = serie;
	            Principal.nucleos10 = nucleos;
	            Principal.hilos10 = hilos;
	            Principal.velocidad10 = velocidad;
	            Principal.video10 = video;
	            break;
	            
	        
	        }

	        // 5. Confirmación
	       	        JOptionPane.showMessageDialog(this,
	                "Datos modificados correctamente");

	        // 6. Cerrar diálogo
		dispose();

	    } catch (NumberFormatException ex) {
	        JOptionPane.showMessageDialog(this,
	                "Ingrese valores numéricos válidos");
	}
	
	// se activa al cambiar el valor del combobox
	
		// 1. obtener datos del modelo
		// 2. actualizar los campos editables con las variables globales en Principal
		// 3. usar codigo personalizado para el variable video que es char
	}
}