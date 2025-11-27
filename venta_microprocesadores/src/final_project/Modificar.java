package gui;

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
	private JComboBox cboModelo;
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
		
		lblModelo = new JLabel("Modelo:");
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
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBackground(new Color(128, 64, 64));
		btnCancelar.setBounds(10, 235, 197, 41);
		getContentPane().add(btnCancelar);
		
		cboModelo = new JComboBox();
		cboModelo.setBounds(154, 6, 270, 22);
		getContentPane().add(cboModelo);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGuardar.setBackground(new Color(128, 64, 64));
		btnGuardar.setBounds(227, 235, 197, 41);
		getContentPane().add(btnGuardar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancel(e);
		}
	}
	protected void actionPerformedBtnCancel(ActionEvent e) {
		dispose();
	}
}