package final_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame; //**** necesaro para referencia de super
import javax.swing.JOptionPane;

public class Descuento extends JDialog implements ActionListener {
	private JLabel lblRangoDesc1;
	private JLabel lblRangoDesc2;
	private JLabel lblRangoDesc3;
	private JLabel lblRangoDesc4;
	private JTextField txtRango1;
	private JTextField txtRango2;
	private JTextField txtRango3;
	private JTextField txtRango4;
	private JLabel lblPorceRan1;
	private JLabel lblPorcenRan2;
	private JLabel lblPorcenRan3;
	private JLabel lblPorcenRan4;
	private JButton btnAceptarDesc;
	private JButton btnCancelarDesc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Descuento dialog = new Descuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Descuento() {
		setTitle("Configurar porcentaje de descuento");
		setBounds(100, 100, 450, 185);
		getContentPane().setLayout(null);
		
		lblRangoDesc1 = new JLabel("1 a 5 unidades");
		lblRangoDesc1.setBounds(10, 30, 105, 14);
		getContentPane().add(lblRangoDesc1);
		
		lblRangoDesc2 = new JLabel("6 a 10 unidades");
		lblRangoDesc2.setBounds(10, 58, 105, 14);
		getContentPane().add(lblRangoDesc2);
		
		lblRangoDesc3 = new JLabel("11 a 15 unidades");
		lblRangoDesc3.setBounds(10, 85, 105, 14);
		getContentPane().add(lblRangoDesc3);
		
		lblRangoDesc4 = new JLabel("M\u00E1s de 15 unidades");
		lblRangoDesc4.setBounds(10, 110, 122, 14);
		getContentPane().add(lblRangoDesc4);
		
		txtRango1 = new JTextField();
		txtRango1.setBounds(142, 27, 86, 20);
		getContentPane().add(txtRango1);
		txtRango1.setColumns(10);
		
		txtRango2 = new JTextField();
		txtRango2.setBounds(142, 55, 86, 20);
		getContentPane().add(txtRango2);
		txtRango2.setColumns(10);
		
		txtRango3 = new JTextField();
		txtRango3.setBounds(142, 82, 86, 20);
		getContentPane().add(txtRango3);
		txtRango3.setColumns(10);
		
		txtRango4 = new JTextField();
		txtRango4.setBounds(142, 107, 86, 20);
		getContentPane().add(txtRango4);
		txtRango4.setColumns(10);
		
		lblPorceRan1 = new JLabel("%");
		lblPorceRan1.setBounds(238, 30, 46, 14);
		getContentPane().add(lblPorceRan1);
		
		lblPorcenRan2 = new JLabel("%");
		lblPorcenRan2.setBounds(238, 58, 46, 14);
		getContentPane().add(lblPorcenRan2);
		
		lblPorcenRan3 = new JLabel("%");
		lblPorcenRan3.setBounds(238, 85, 46, 14);
		getContentPane().add(lblPorcenRan3);
		
		lblPorcenRan4 = new JLabel("%");
		lblPorcenRan4.setBounds(238, 110, 46, 14);
		getContentPane().add(lblPorcenRan4);
		
		btnAceptarDesc = new JButton("Aceptar");
		btnAceptarDesc.addActionListener(this);
		btnAceptarDesc.setBackground(new Color(0, 64, 128));
		btnAceptarDesc.setForeground(new Color(255, 255, 255));
		btnAceptarDesc.setBounds(317, 26, 89, 23);
		getContentPane().add(btnAceptarDesc);
		
		btnCancelarDesc = new JButton("Cancelar");
		btnCancelarDesc.addActionListener(this);
		btnCancelarDesc.setBackground(new Color(128, 64, 64));
		btnCancelarDesc.setForeground(new Color(255, 255, 255));
		btnCancelarDesc.setBounds(317, 58, 89, 23);
		getContentPane().add(btnCancelarDesc);
		
		cargarPorcentajesIniciales(); // carga los porcentajes de la variables globales
	}
	
	// Carga los valores actuales de las variables estáticas de Principal
    private void cargarPorcentajesIniciales() {
        // Asumiendo que 'Principal' es tu clase principal y tiene variables est�ticas
        txtRango1.setText(String.valueOf(Principal.porcentaje1));
        txtRango2.setText(String.valueOf(Principal.porcentaje2));
        txtRango3.setText(String.valueOf(Principal.porcentaje3));
        txtRango4.setText(String.valueOf(Principal.porcentaje4));
    }
    
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptarDesc) {
			actionPerformedBtnAceptarDesc(e);
		}
		if (e.getSource() == btnCancelarDesc) {
			actionPerformedBtnCancelarDesc(e);
		}
	}
	protected void actionPerformedBtnCancelarDesc(ActionEvent e) {
		dispose(); //cierra el dialogo
	}
	protected void actionPerformedBtnAceptarDesc(ActionEvent e) {
		try {
            // Guardar los valores en las variables estáticas de Principal
            Principal.porcentaje1 = Double.parseDouble(txtRango1.getText());
            Principal.porcentaje2 = Double.parseDouble(txtRango2.getText());
            Principal.porcentaje3 = Double.parseDouble(txtRango3.getText());
            Principal.porcentaje4 = Double.parseDouble(txtRango4.getText());
            
            // Cerrar la caja de diálogo solo si el formato es correcto
            this.dispose(); 
            
		} catch (NumberFormatException ex) {
            // Manejo de error si se introduce un valor no numérico
			JOptionPane.showMessageDialog(this,
				"Error: Aseg�rese de ingresar números decimales válidos en todos los campos.",
				"Error de Porcentaje para Descuento",
				JOptionPane.ERROR_MESSAGE);
		}
	}
}
