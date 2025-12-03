package final_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventas extends JDialog implements ActionListener {
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JComboBox <String>cboModelo;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scp;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ventas dialog = new Ventas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ventas() {
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setModal(true);
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(23, 25, 67, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio(S/)");
		lblPrecio.setBounds(23, 51, 67, 14);
		getContentPane().add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(23, 76, 67, 14);
		getContentPane().add(lblCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(100, 48, 148, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setEditable(false);
		txtCantidad.setBounds(100, 73, 148, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cboModelo = new JComboBox<String>();
		cboModelo.setBounds(100, 21, 148, 22);
		Principal princ = new Principal();
		cboModelo.addItem(princ.modelo1);
		cboModelo.addItem(princ.modelo2);
		cboModelo.addItem(princ.modelo3);
		cboModelo.addItem(princ.modelo4);
		cboModelo.addItem(princ.modelo5);
		cboModelo.addItem(princ.modelo6);
		cboModelo.addItem(princ.modelo7);
		cboModelo.addItem(princ.modelo8);
		cboModelo.addItem(princ.modelo9);
		cboModelo.addItem(princ.modelo10);
		getContentPane().add(cboModelo);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(314, 25, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar ");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(314, 51, 89, 23);
		getContentPane().add(btnCerrar);
		
		scp = new JScrollPane();
		scp.setBounds(23, 106, 380, 148);
		getContentPane().add(scp);
		
		txtS = new JTextArea();
		scp.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) 
	{dispose();
	}
}
