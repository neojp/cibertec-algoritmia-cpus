package final_project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Listar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnCerrar;
	private JButton btnListar;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Listar dialog = new Listar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Listar() {
		setTitle("Listado de Microprocesadores");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JScrollPane scp = new JScrollPane();
			scp.setBounds(10, 11, 414, 205);
			getContentPane().add(scp);
			{
				txtS = new JTextArea();
				txtS.setEditable(false);
				scp.setViewportView(txtS);
			}
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(113, 227, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			btnListar = new JButton("Listar");
			btnListar.addActionListener(this);
			btnListar.setBounds(227, 227, 89, 23);
			getContentPane().add(btnListar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		Principal princ = new Principal();
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);

		txtS.setText("LISTADO DE MICROPROCESADORES \n\n");
		txtS.append("Nombre: " + princ.modelo1 + "\n");
		txtS.append("Precio: \n");
		txtS.append("Fabricante: \n");
		txtS.append("Número de Núcleos: \n");
		txtS.append("Número de Hilos: \n");
		txtS.append("Velocidad de Núcleos: \n");
		txtS.append("Tarjeta de Video Integrada: \n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: " + princ.modelo2 + "\n");
		txtS.append("Precio: \n");
		txtS.append("Fabricante: \n");
		txtS.append("Número de Núcleos: \n");
		txtS.append("Número de Hilos: \n");
		txtS.append("Velocidad de Núcleos: \n");
		txtS.append("Tarjeta de Video Integrada: \n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: " + princ.modelo3 + "\n");
		txtS.append("Precio: \n");
		txtS.append("Fabricante: \n");
		txtS.append("Número de Núcleos: \n");
		txtS.append("Número de Hilos: \n");
		txtS.append("Velocidad de Núcleos: \n");
		txtS.append("Tarjeta de Video Integrada: \n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: " + princ.modelo4 + "\n");
		txtS.append("Precio: $" + df.format(princ.precio4) + "\n");
		txtS.append("Fabricante: " + princ.fabricante4 + "\n");
		txtS.append("Número de Núcleos: " + princ.nucleos4 + "\n");
		txtS.append("Número de Hilos: " + princ.hilos4 + "\n");
		txtS.append("Velocidad de Núcleos: " + princ.velocidad4 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: " + (princ.video4 == 1 ? "Si" : "No") + "\n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: " + princ.modelo5 + "\n");
		txtS.append("Precio: $" + df.format(princ.precio5) + "\n");
		txtS.append("Fabricante: " + princ.fabricante5 + "\n");
		txtS.append("Número de Núcleos: " + princ.nucleos5 + "\n");
		txtS.append("Número de Hilos: " + princ.hilos5 + "\n");
		txtS.append("Velocidad de Núcleos: " + princ.velocidad5 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: " + (princ.video5 == 1 ? "Si" : "No") + "\n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: " + princ.modelo6 + "\n");
		txtS.append("Precio: \n");
		txtS.append("Fabricante: \n");
		txtS.append("Número de Núcleos: \n");
		txtS.append("Número de Hilos: \n");
		txtS.append("Velocidad de Núcleos: \n");
		txtS.append("Tarjeta de Video Integrada: \n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: " + princ.modelo7 + "\n");
		txtS.append("Precio: \n");
		txtS.append("Fabricante: \n");
		txtS.append("Número de Núcleos: \n");
		txtS.append("Número de Hilos: \n");
		txtS.append("Velocidad de Núcleos: \n");
		txtS.append("Tarjeta de Video Integrada: \n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: " + princ.modelo8 + "\n");
		txtS.append("Precio: \n");
		txtS.append("Fabricante: \n");
		txtS.append("Número de Núcleos: \n");
		txtS.append("Número de Hilos: \n");
		txtS.append("Velocidad de Núcleos: \n");
		txtS.append("Tarjeta de Video Integrada: \n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: " + princ.modelo9 + "\n");
		txtS.append("Precio: \n");
		txtS.append("Fabricante: \n");
		txtS.append("Número de Núcleos: \n");
		txtS.append("Número de Hilos: \n");
		txtS.append("Velocidad de Núcleos: \n");
		txtS.append("Tarjeta de Video Integrada: \n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: " + princ.modelo10 + "\n");
		txtS.append("Precio: \n");
		txtS.append("Fabricante: \n");
		txtS.append("Número de Núcleos: \n");
		txtS.append("Número de Hilos: \n");
		txtS.append("Velocidad de Núcleos: \n");
		txtS.append("Tarjeta de Video Integrada: \n");
		txtS.append("\n\n");
	}
}
