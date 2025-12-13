package final_project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
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
				txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
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
		// formatear numeros enteros con 2 decimales
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);

		// mostrar resultados
		txtS.setText("LISTADO DE MICROPROCESADORES \n\n");
		
		txtS.append("Nombre: \t\t\t" + Principal.modelo1 + "\n");
		txtS.append("Precio: \t\t\t$" + df.format(Principal.precio1) + "\n");
		txtS.append("Fabricante: \t\t\t" + Principal.fabricante1 + "\n");
		txtS.append("Número de Núcleos: \t\t" + Principal.nucleos1 + "\n");
		txtS.append("Número de Hilos: \t\t" + Principal.hilos1 + "\n");
		txtS.append("Velocidad de Núcleos: \t\t" + Principal.velocidad1 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: \t" + (Principal.video1 == 1 ? "Si" : "No") + "\n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: \t\t\t" + Principal.modelo2 + "\n");
		txtS.append("Precio: \t\t\t$" + df.format(Principal.precio2) + "\n");
		txtS.append("Fabricante: \t\t\t" + Principal.fabricante2 + "\n");
		txtS.append("Número de Núcleos: \t\t" + Principal.nucleos2 + "\n");
		txtS.append("Número de Hilos: \t\t" + Principal.hilos2 + "\n");
		txtS.append("Velocidad de Núcleos: \t\t" + Principal.velocidad2 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: \t" + (Principal.video2 == 1 ? "Si" : "No") + "\n");
		txtS.append("\n\n");

		txtS.append("Nombre: \t\t\t" + Principal.modelo3 + "\n");
		txtS.append("Precio: \t\t\t$" + df.format(Principal.precio3) + "\n");
		txtS.append("Fabricante: \t\t\t" + Principal.fabricante3 + "\n");
		txtS.append("Número de Núcleos: \t\t" + Principal.nucleos3 + "\n");
		txtS.append("Número de Hilos: \t\t" + Principal.hilos3 + "\n");
		txtS.append("Velocidad de Núcleos: \t\t" + Principal.velocidad3 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: \t" + (Principal.video3 == 1 ? "Si" : "No") + "\n");
		txtS.append("\n\n");

		txtS.append("Nombre: \t\t\t" + Principal.modelo4 + "\n");
		txtS.append("Precio: \t\t\t$" + df.format(Principal.precio4) + "\n");
		txtS.append("Fabricante: \t\t\t" + Principal.fabricante4 + "\n");
		txtS.append("Número de Núcleos: \t\t" + Principal.nucleos4 + "\n");
		txtS.append("Número de Hilos: \t\t" + Principal.hilos4 + "\n");
		txtS.append("Velocidad de Núcleos: \t\t" + Principal.velocidad4 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: \t" + (Principal.video4 == 1 ? "Si" : "No") + "\n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: \t\t\t" + Principal.modelo5 + "\n");
		txtS.append("Precio: \t\t\t$" + df.format(Principal.precio5) + "\n");
		txtS.append("Fabricante: \t\t\t" + Principal.fabricante5 + "\n");
		txtS.append("Número de Núcleos: \t\t" + Principal.nucleos5 + "\n");
		txtS.append("Número de Hilos: \t\t" + Principal.hilos5 + "\n");
		txtS.append("Velocidad de Núcleos: \t\t" + Principal.velocidad5 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: \t" + (Principal.video5 == 1 ? "Si" : "No") + "\n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: \t\t\t" + Principal.modelo6 + "\n");
		txtS.append("Precio: \t\t\t$" + df.format(Principal.precio6) + "\n");
		txtS.append("Fabricante: \t\t\t" + Principal.fabricante6 + "\n");
		txtS.append("Número de Núcleos: \t\t" + Principal.nucleos6 + "\n");
		txtS.append("Número de Hilos: \t\t" + Principal.hilos6 + "\n");
		txtS.append("Velocidad de Núcleos: \t\t" + Principal.velocidad6 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: \t" + (Principal.video6 == 1 ? "Si" : "No") + "\n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: \t\t\t" + Principal.modelo7 + "\n");
		txtS.append("Precio: \t\t\t$" + df.format(Principal.precio7) + "\n");
		txtS.append("Fabricante: \t\t\t" + Principal.fabricante7 + "\n");
		txtS.append("Número de Núcleos: \t\t" + Principal.nucleos7 + "\n");
		txtS.append("Número de Hilos: \t\t" + Principal.hilos7 + "\n");
		txtS.append("Velocidad de Núcleos: \t\t" + Principal.velocidad7 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: \t" + (Principal.video7 == 1 ? "Si" : "No") + "\n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: \t\t\t" + Principal.modelo8 + "\n");
		txtS.append("Precio: \t\t\t$" + df.format(Principal.precio8) + "\n");
		txtS.append("Fabricante: \t\t\t" + Principal.fabricante8 + "\n");
		txtS.append("Número de Núcleos: \t\t" + Principal.nucleos8 + "\n");
		txtS.append("Número de Hilos: \t\t" + Principal.hilos8 + "\n");
		txtS.append("Velocidad de Núcleos: \t\t" + Principal.velocidad8 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: \t" + (Principal.video8 == 1 ? "Si" : "No") + "\n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: \t\t\t" + Principal.modelo9 + "\n");
		txtS.append("Precio: \t\t\t$" + df.format(Principal.precio9) + "\n");
		txtS.append("Fabricante: \t\t\t" + Principal.fabricante9 + "\n");
		txtS.append("Número de Núcleos: \t\t" + Principal.nucleos9 + "\n");
		txtS.append("Número de Hilos: \t\t" + Principal.hilos9 + "\n");
		txtS.append("Velocidad de Núcleos: \t\t" + Principal.velocidad9 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: \t" + (Principal.video9 == 1 ? "Si" : "No") + "\n");
		txtS.append("\n\n");
		
		txtS.append("Nombre: \t\t\t" + Principal.modelo10 + "\n");
		txtS.append("Precio: \t\t\t$" + df.format(Principal.precio10) + "\n");
		txtS.append("Fabricante: \t\t\t" + Principal.fabricante10 + "\n");
		txtS.append("Número de Núcleos: \t\t" + Principal.nucleos10 + "\n");
		txtS.append("Número de Hilos: \t\t" + Principal.hilos10 + "\n");
		txtS.append("Velocidad de Núcleos: \t\t" + Principal.velocidad10 + "Ghz" + "\n");
		txtS.append("Tarjeta de Video Integrada: \t" + (Principal.video10 == 1 ? "Si" : "No") + "\n");

		// hacer scroll a la primera linea
		txtS.setCaretPosition(0);
	}
}
