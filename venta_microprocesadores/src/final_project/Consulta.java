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
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Consulta extends JDialog implements ActionListener {

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
	private JButton btnCancel;
	private JComboBox cboModelo;

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
		
		txtGraficosIntegrados = new JTextField();
		txtGraficosIntegrados.setEditable(false);
		txtGraficosIntegrados.setColumns(10);
		txtGraficosIntegrados.setBounds(154, 204, 270, 20);
		getContentPane().add(txtGraficosIntegrados);
		
		lblGraficosIntegrados = new JLabel("Graficos Integrados");
		lblGraficosIntegrados.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGraficosIntegrados.setBounds(10, 206, 134, 17);
		getContentPane().add(lblGraficosIntegrados);
		
		btnCancel = new JButton("CANCELAR");
		btnCancel.addActionListener(this);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setBackground(new Color(128, 64, 64));
		btnCancel.setBounds(10, 235, 414, 41);
		getContentPane().add(btnCancel);
		
		cboModelo = new JComboBox();
		cboModelo.setBounds(154, 6, 270, 22);
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
}
