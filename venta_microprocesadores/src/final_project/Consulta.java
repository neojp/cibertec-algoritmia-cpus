package final_project;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
//import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
//import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Consulta extends JDialog implements ActionListener, ItemListener {

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
	private JTextField txtGraficos;
	private JLabel lblGraficos;
	private JButton btnCancel;
	private JComboBox<String> cboModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta dialog = new Consulta();
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
	public Consulta() {
		setTitle("Consultar Microprocesador");
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
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(154, 36, 270, 20);
		getContentPane().add(txtPrecio);
		
		lblFabricante = new JLabel("Fabricante");
		lblFabricante.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFabricante.setBounds(10, 67, 134, 14);
		getContentPane().add(lblFabricante);
		
		txtFabricante = new JTextField();
		txtFabricante.setEditable(false);
		txtFabricante.setColumns(10);
		txtFabricante.setBounds(154, 64, 270, 20);
		getContentPane().add(txtFabricante);
		
		lblSerie = new JLabel("Serie");
		lblSerie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSerie.setBounds(10, 95, 134, 14);
		getContentPane().add(lblSerie);
		
		txtSerie = new JTextField();
		txtSerie.setEditable(false);
		txtSerie.setColumns(10);
		txtSerie.setBounds(154, 92, 270, 20);
		getContentPane().add(txtSerie);
		
		lblNucleos = new JLabel("Nucleos");
		lblNucleos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNucleos.setBounds(10, 123, 134, 14);
		getContentPane().add(lblNucleos);
		
		txtNucleos = new JTextField();
		txtNucleos.setEditable(false);
		txtNucleos.setColumns(10);
		txtNucleos.setBounds(154, 120, 270, 20);
		getContentPane().add(txtNucleos);
		
		lblHilos = new JLabel("Hilos");
		lblHilos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHilos.setBounds(10, 151, 134, 14);
		getContentPane().add(lblHilos);
		
		txtHilos = new JTextField();
		txtHilos.setEditable(false);
		txtHilos.setColumns(10);
		txtHilos.setBounds(154, 148, 270, 20);
		getContentPane().add(txtHilos);
		
		lblVelNucleos = new JLabel("Velocidad de Nucleos");
		lblVelNucleos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVelNucleos.setBounds(10, 179, 134, 14);
		getContentPane().add(lblVelNucleos);
		
		txtVelNucleos = new JTextField();
		txtVelNucleos.setEditable(false);
		txtVelNucleos.setColumns(10);
		txtVelNucleos.setBounds(154, 176, 270, 20);
		getContentPane().add(txtVelNucleos);
		
		txtGraficos = new JTextField();
		txtGraficos.setEditable(false);
		txtGraficos.setColumns(10);
		txtGraficos.setBounds(154, 204, 270, 20);
		getContentPane().add(txtGraficos);
		
		lblGraficos = new JLabel("Graficos Integrados");
		lblGraficos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGraficos.setBounds(10, 206, 134, 17);
		getContentPane().add(lblGraficos);
		
		btnCancel = new JButton("CERRAR");
		btnCancel.addActionListener(this);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setBackground(new Color(128, 64, 64));
		btnCancel.setBounds(10, 235, 414, 41);
		getContentPane().add(btnCancel);
		
		cboModelo = new JComboBox<String>();
		cboModelo.addItemListener(this);
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

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			actionPerformedBtnCancel(e);
		}
	}
	protected void actionPerformedBtnCancel(ActionEvent e) {
		dispose();
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboModelo) {
			itemStateChangedCboModelo(e);
		}
	}
	protected void itemStateChangedCboModelo(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			fillInformation(cboModelo.getSelectedIndex());
		}
	}
	
	void fillInformation(int index) {
		switch(index) {
			case 0: 
				txtFabricante.setText(Principal.fabricante1);
				txtGraficos.setText(Principal.formatVideo(Principal.video1));
				txtHilos.setText(String.valueOf(Principal.hilos1));
				txtNucleos.setText(String.valueOf(Principal.nucleos1));
				txtPrecio.setText(Principal.formatPrecio(Principal.precio1));
				txtSerie.setText(Principal.series1);
				txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad1));
			break;
			case 1: 
				txtFabricante.setText(Principal.fabricante2);
				txtGraficos.setText(Principal.formatVideo(Principal.video2));
				txtHilos.setText(String.valueOf(Principal.hilos2));
				txtNucleos.setText(String.valueOf(Principal.nucleos2));
				txtPrecio.setText(Principal.formatPrecio(Principal.precio2));
				txtSerie.setText(Principal.series2);
				txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad2));
			break;
			case 2: 
				txtFabricante.setText(Principal.fabricante3);
				txtGraficos.setText(Principal.formatVideo(Principal.video3));
				txtHilos.setText(String.valueOf(Principal.hilos3));
				txtNucleos.setText(String.valueOf(Principal.nucleos3));
				txtPrecio.setText(Principal.formatPrecio(Principal.precio3));
				txtSerie.setText(Principal.series3);
				txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad3));
			break;
			case 3: 
				txtFabricante.setText(Principal.fabricante4);
				txtGraficos.setText(Principal.formatVideo(Principal.video4));
				txtHilos.setText(String.valueOf(Principal.hilos4));
				txtNucleos.setText(String.valueOf(Principal.nucleos4));
				txtPrecio.setText(Principal.formatPrecio(Principal.precio4));
				txtSerie.setText(Principal.series4);
				txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad4));
			break;
			case 4: 
				txtFabricante.setText(Principal.fabricante5);
				txtGraficos.setText(Principal.formatVideo(Principal.video5));
				txtHilos.setText(String.valueOf(Principal.hilos5));
				txtNucleos.setText(String.valueOf(Principal.nucleos5));
				txtPrecio.setText(Principal.formatPrecio(Principal.precio5));
				txtSerie.setText(Principal.series5);
				txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad5));
			break;
			case 5: 
				txtFabricante.setText(Principal.fabricante6);
				txtGraficos.setText(Principal.formatVideo(Principal.video6));
				txtHilos.setText(String.valueOf(Principal.hilos6));
				txtNucleos.setText(String.valueOf(Principal.nucleos6));
				txtPrecio.setText("$"+ Principal.precio6);
				txtSerie.setText(Principal.series6);
				txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad6));
			break;
			case 6: 
				txtFabricante.setText(Principal.fabricante7);
				txtGraficos.setText(Principal.formatVideo(Principal.video7));
				txtHilos.setText(String.valueOf(Principal.hilos7));
				txtNucleos.setText(String.valueOf(Principal.nucleos7));
				txtPrecio.setText("$"+ Principal.precio7);
				txtSerie.setText(Principal.series7);
				txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad7));
			break;
			case 7: 
				txtFabricante.setText(Principal.fabricante8);
				txtGraficos.setText(Principal.formatVideo(Principal.video8));
				txtHilos.setText(String.valueOf(Principal.hilos8));
				txtNucleos.setText(String.valueOf(Principal.nucleos8));
				txtPrecio.setText("$"+ Principal.precio8);
				txtSerie.setText(Principal.series8);
				txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad8));
			break;
			case 8: 
				txtFabricante.setText(Principal.fabricante9);
				txtGraficos.setText(Principal.formatVideo(Principal.video9));
				txtHilos.setText(String.valueOf(Principal.hilos9));
				txtNucleos.setText(String.valueOf(Principal.nucleos9));
				txtPrecio.setText("$"+ Principal.precio9);
				txtSerie.setText(Principal.series9);
				txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad9));
			break;
			default : 
				txtFabricante.setText(Principal.fabricante10);
				txtGraficos.setText(Principal.formatVideo(Principal.video10));
				txtHilos.setText(String.valueOf(Principal.hilos10));
				txtNucleos.setText(String.valueOf(Principal.nucleos10));
				txtPrecio.setText("$"+ Principal.precio10);
				txtSerie.setText(Principal.series10);
				txtVelNucleos.setText(Principal.formatGhz(Principal.velocidad10));
			break;
		}
	}
}