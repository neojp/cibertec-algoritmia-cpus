package final_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

		lblObs1 = new JLabel("1 Unidad");
		lblObs1.setBounds(10, 11, 100, 14);
		getContentPane().add(lblObs1);

		txtObs1 = new JTextField();
		lblObs1.setLabelFor(txtObs1);
		txtObs1.setBounds(140, 8, 129, 20);
		getContentPane().add(txtObs1);
		txtObs1.setColumns(10);

		lblObs2 = new JLabel("2 a 5 unidades");
		lblObs2.setBounds(10, 39, 100, 14);
		getContentPane().add(lblObs2);

		txtObs2 = new JTextField();
		lblObs2.setLabelFor(txtObs2);
		txtObs2.setColumns(10);
		txtObs2.setBounds(140, 36, 129, 20);
		getContentPane().add(txtObs2);

		lblObs3 = new JLabel("6 a más unidades");
		lblObs3.setBounds(10, 67, 100, 14);
		getContentPane().add(lblObs3);

		txtObs3 = new JTextField();
		lblObs3.setLabelFor(txtObs3);
		txtObs3.setColumns(10);
		txtObs3.setBounds(140, 64, 129, 20);
		getContentPane().add(txtObs3);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBackground(new Color(0, 64, 128));
		btnAceptar.setForeground(new Color(255, 255, 255));
		btnAceptar.setBounds(300, 7, 89, 23);
		getContentPane().add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBackground(new Color(128, 64, 64));
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBounds(300, 35, 89, 23);
		getContentPane().add(btnCancelar);
		
		// actualizar campos con variables globales
		actualizarForm();
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
		// validar formulario
		if (!validarFormulario()) {
			return;
		}

		// actualizar obsequios
		actualizarObs();
		
		// cerrar ventana
		dispose();
	}
	
	// validar si los campos txtObs1, txtObs2, txtObs3 estan vacíos
	private boolean validarFormulario() {
		try {
			if (txtObs1.getText().trim().isEmpty() || txtObs2.getText().trim().isEmpty() || txtObs3.getText().trim().isEmpty()) {
				throw new Exception("Campo no puede estar vacío");
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		return true;
	}

	// actualizar campos con variables globales
	private void actualizarForm() {
		txtObs1.setText("" + Principal.obsequio1);
		txtObs2.setText("" + Principal.obsequio2);
		txtObs3.setText("" + Principal.obsequio3);
	}

	// actualizar variables globales obsequio1, obsequio2, obsequio3
	private void actualizarObs() {
		Principal.obsequio1 = txtObs1.getText();
		Principal.obsequio2 = txtObs2.getText();
		Principal.obsequio3 = txtObs3.getText();
	}
	
	// cerrar ventana
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
