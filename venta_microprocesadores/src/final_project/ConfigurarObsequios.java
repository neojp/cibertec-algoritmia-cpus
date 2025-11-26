package final_project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequios extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtObs1;
	private JTextField txtObs2;
	private JTextField txtObs3;
	private JLabel lblObs3;
	private JLabel lblObs2;
	private JLabel lblObs1;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarObsequios dialog = new ConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequios() {
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 415, 134);
		getContentPane().setLayout(null);
		{
			lblObs1 = new JLabel("1 Unidad");
			lblObs1.setBounds(10, 11, 100, 14);
			getContentPane().add(lblObs1);
		}
		{
			txtObs1 = new JTextField();
			lblObs1.setLabelFor(txtObs1);
			txtObs1.setBounds(140, 8, 129, 20);
			getContentPane().add(txtObs1);
			txtObs1.setColumns(10);
		}
		{
			lblObs2 = new JLabel("2 a 5 unidades");
			lblObs2.setBounds(10, 39, 100, 14);
			getContentPane().add(lblObs2);
		}
		{
			txtObs2 = new JTextField();
			lblObs2.setLabelFor(txtObs2);
			txtObs2.setColumns(10);
			txtObs2.setBounds(140, 36, 129, 20);
			getContentPane().add(txtObs2);
		}
		{
			lblObs3 = new JLabel("6 a más unidades");
			lblObs3.setBounds(10, 67, 100, 14);
			getContentPane().add(lblObs3);
		}
		{
			txtObs3 = new JTextField();
			lblObs3.setLabelFor(txtObs3);
			txtObs3.setColumns(10);
			txtObs3.setBounds(140, 64, 129, 20);
			getContentPane().add(txtObs3);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(300, 7, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(300, 35, 89, 23);
			getContentPane().add(btnCancelar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		// actualizar obsequio1, obsequio2, obsequio3
//		obsequio1 = txtObs1.getText();
//		obsequio2 = txtObs2.getText();
//		obsequio3 = txtObs3.getText();
		dispose();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
