package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Alerta extends JDialog implements ActionListener {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JLabel lblIcono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Alerta dialog = new Alerta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

	/**
	 * Create the dialog.
	 */
	public Alerta() {
		setTitle("Avance de ventas\r\n");
		setBounds(100, 100, 373, 137);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Venta Nro.  5");
		lblNewLabel.setBounds(80, 11, 125, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Importe total general acumulado : S/.13167.38");
		lblNewLabel_1.setBounds(80, 23, 315, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Porcentaje de la cuota diaria : 26.33%");
		lblNewLabel_2.setBounds(80, 36, 221, 14);
		getContentPane().add(lblNewLabel_2);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(146, 61, 89, 23);
		getContentPane().add(btnNewButton);
		
		lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon("C:\\Users\\Donnie\\Downloads\\Alerta.png"));
		lblIcono.setBounds(10, 11, 46, 40);
		getContentPane().add(lblIcono);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
}
